package com.target.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.target.entity.Rule;

@Repository
public interface RuleRepository extends CrudRepository<Rule, Long>{

	Rule findByRule(String rule);
}
