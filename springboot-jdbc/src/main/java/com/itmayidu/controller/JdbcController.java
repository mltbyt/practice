package com.itmayidu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayidu.service.JdbcService;

@RestController
public class JdbcController {
	@Autowired
	private JdbcService jdbcService;
	@RequestMapping("/createUser")
	public String createUser(){
		jdbcService.addUser("dd", 12);
		return "success";
		
	}

}
