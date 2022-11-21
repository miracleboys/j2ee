package me.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
	
	// 账号登录
	@RequestMapping(value = "/signIn", produces = "text/html;charset=utf-8")
	public String signIn() {
		return "signIn";
	}
	
	// 账号注册
		@RequestMapping(value = "/signUp", produces = "text/html;charset=utf-8")
		public String signUp() {
			return "signUp";
		}
}
