package com.target.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.target.entity.GeneralInfo;
import com.target.entity.Request;
import com.target.entity.Response;
import com.target.service.Service;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private Service service;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<Response> createRecord(@RequestBody Request request) {
		Response response = new Response();
		GeneralInfo create = service.create(request);
		response.setStatus("200");
		response.setMessage("Successfull Created");
		response.setInfo(create);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}