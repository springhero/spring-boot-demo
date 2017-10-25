package com.target.entity;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class Request implements Serializable {

	private Long id ;

	private String status;
	
	private String description;

	private String applicationName;
	
	private String accessType;
	
	private String fileName;

	private String transferMethod;
	
	private Set<Rule> rules;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTransferMethod() {
		return transferMethod;
	}

	public void setTransferMethod(String transferMethod) {
		this.transferMethod = transferMethod;
	}

	public Set<Rule> getRules() {
		return rules;
	}

	public void setRules(Set<Rule> rules) {
		this.rules = rules;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
