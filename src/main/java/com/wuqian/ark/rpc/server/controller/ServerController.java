package com.wuqian.ark.rpc.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

	@RequestMapping(value = "/springboot", method = RequestMethod.GET)
	public String login() {
		return "success";
	}
}
