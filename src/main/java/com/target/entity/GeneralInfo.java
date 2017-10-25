package com.target.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GENERAL_INFO")
public class GeneralInfo {
	@Id
	@Column(name = "ID")
	private Long id ;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "APPLICATION_NAME")
	private String applicationName;

	@Column(name = "ACCESS_TYPE")
	private String accessType;

	@Column(name = "FILENAME")
	private String fileName;

	@Column(name = "TRANSFER_METHOD")
	private String transferMethod;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "INFO_RULE", joinColumns = { @JoinColumn(name = "ID") }, inverseJoinColumns = {
			@JoinColumn(name = "RULE_ID") })
	private Set<Rule> rules = new HashSet<Rule>(0);

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

	public String getTransferMethod() {
		return transferMethod;
	}

	public void setTransferMethod(String transferMethod) {
		this.transferMethod = transferMethod;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public Set<Rule> getRules() {
		return rules;
	}

	public void setRules(Set<Rule> rules) {
		this.rules = rules;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
