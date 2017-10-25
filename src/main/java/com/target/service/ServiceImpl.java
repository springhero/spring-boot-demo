package com.target.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.dao.GeneralInfoRepository;
import com.target.dao.RuleRepository;
import com.target.entity.GeneralInfo;
import com.target.entity.Request;
import com.target.entity.Rule;

@Service
public class ServiceImpl implements com.target.service.Service {

	@Autowired
	private GeneralInfoRepository generalInfoRepository;

	@Autowired
	private RuleRepository ruleRepository;

	@Override
	public GeneralInfo create(Request request) {
		GeneralInfo info = new GeneralInfo();
		info.setApplicationName(request.getApplicationName());
		info.setDescription(request.getDescription());
		info.setId(Long.valueOf(request.getId()));
		info.setStatus(request.getStatus());
		info.setFileName(request.getFileName());
		info.setAccessType(request.getAccessType());
		info.setTransferMethod(request.getTransferMethod());
		Set<Rule> rules = new HashSet<>();
		for (Rule r : request.getRules()) {
			Rule findByRule = ruleRepository.findByRule(r.getRule());
			if(findByRule == null){
				Rule rule = new Rule();
				rule.setRule(r.getRule());
				findByRule = rule;
			}
			rules.add(ruleRepository.save(findByRule));
		}
		info.setRules(rules);
		return generalInfoRepository.save(info);
	}

}
