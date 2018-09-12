package com.itmayidu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/hello")
	public List<String> hello(){
		List<String> listUser = new ArrayList<String>();
		listUser.add("zhangsan");
		listUser.add("lisi");
		listUser.add("wangwu");
		return listUser;
	}
}
