package com.itmayidu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.itmayidu.service.JdbcService;

@Service
public class JdbcServiceImpl implements JdbcService{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addUser(String name, int age) {
		jdbcTemplate.update("insert into users values(null,?,?);", name,age);
		
	}

}
