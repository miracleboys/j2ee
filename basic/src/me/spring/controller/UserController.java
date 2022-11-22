package me.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.spring.bean.Result;
import me.spring.entity.User;
import me.spring.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	 @Autowired
	 UserService userService;
	
	// 账号登录
	@RequestMapping(value = "/signIn", produces = "text/html;charset=utf-8")
	public String signIn() {
		return "signIn";
	}
	
	// 账号注册
		@RequestMapping(value = "/signUp", produces = "text/html;charset=utf-8")
		public String signUp(User user, Model model) {
			
			
	        User userd = new User();
	        
			model.addAttribute("user", userd);
		   
			return "signUp";
		}
		
		@RequestMapping(value = "/add", produces = "text/html;charset=utf-8")
		public String add(User user, Model model) {
			Result result = new Result();
			try {
//				user.setUsername("ss");
//				user.setCaption("ss");
//				user.setPassword("sssss");
//				user.setTelephone("12313");
	            int resultCount = userService.add(user);
	            if (resultCount > 0) {
	                result.setCode(0);
	                result.setMsg("添加成功");
	            } else {
	                result.setCode(-1);
	                result.setMsg("添加失败");
	            }
	        } catch (Exception e) {
	            result.setCode(-1);
	            result.setMsg("添加失败,hhh");
	            e.printStackTrace();
	        }
//			result.setData(userService.listAll());
	        model.addAttribute("user", user);
	        model.addAttribute("result", result);
	        
			return "signUp";
		}
		
		
}
