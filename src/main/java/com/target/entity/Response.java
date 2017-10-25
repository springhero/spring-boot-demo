package com.target.entity;

public class Response {

	private String status;

	private String message;

	private GeneralInfo info;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GeneralInfo getInfo() {
		return info;
	}

	public void setInfo(GeneralInfo info) {
		this.info = info;
	}
}
