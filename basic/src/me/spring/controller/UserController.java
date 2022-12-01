package me.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	 
	// 账号注册
	@RequestMapping(value = "/signUp", produces = "text/html;charset=utf-8")
	public String signUp(User user, Model model) {
		
        User userd = new User();
        Result result = new Result();
		result.setCode(0);
		result.setMsg("无");
		model.addAttribute("user", userd);
		model.addAttribute("result", result);
		return "signUp";
	}
	
	@RequestMapping(value = "/add", produces = "text/html;charset=utf-8")
	public String add(@Valid User user, BindingResult bindingResult, Model model) {
		Result result = new Result();
		try {
			// 数据库
			if(user.getPassword().equals(user.getRpassword()) && !user.getPassword().equals(DigestUtils.sha1Hex(""))
					&& !user.getUsername().equals("")) {
			
            int resultCount = userService.add(user);
            int resultCountrole = userService.setUserRole(user);
            if (resultCount > 0 && resultCountrole > 0) {
                result.setCode(0);
                result.setMsg("注册成功");
            } else {
                result.setCode(-1);
                result.setMsg("注册失败");
            }
			}
			else {
				result.setCode(-1);
                result.setMsg("注册失败");
			}
        } catch (Exception e) {
            result.setCode(-1);
            result.setMsg("注册失败");
            e.printStackTrace();
        }
        model.addAttribute("user", user);
        model.addAttribute("result", result);
        
		return "signUp2";
	}
	
	// 账号登录
	@RequestMapping(value = "/signIn", produces = "text/html;charset=utf-8")
	public String signIn(User user, Model model, HttpServletRequest request) {
		Result result = new Result();
		User userd = new User();
		result.setCode(0);
		result.setMsg("无");
		model.addAttribute("user", userd);
		model.addAttribute("result", result);
		
		request.getSession().setAttribute("person", "ssss");
		return "signIn";
	}
	
	// 登录主界面
	@RequestMapping(value = "/lognIn", produces = "text/html;charset=utf-8")
	public String lognIn(User user, Model model, HttpServletRequest request) {
		Result result = new Result();
		
		if(user.toString().isEmpty()) {
			 user =new User();
        }
		
		try {
			List<User> userd = userService.find(user);
			System.out.println("------------------");
			System.out.println("------------------");
			System.out.println(userd);
			System.out.println("------------------");
			System.out.println("------------------");
			model.addAttribute("user", user);
			return "user";
			
		}catch (Exception e) {
            result.setCode(-1);
            result.setMsg("登录失败");
            e.printStackTrace();
            model.addAttribute("result", result);
            return "signIn";
        }
		
	}
	
	// 个人信息界面
	
	
	// 个人信息修改
//	@RequestMapping(value = "/informationChange", produces = "text/html;charset=utf-8")
//	public String informationChange(@Valid User user, BindingResult bindingResult, Model model) {
//		Result result = new Result();
//		String resultpassword = "";
//		model.addAttribute("resultpassword", resultpassword);
//		try {
//			int resultCount = 1;
//			if (!user.getPassword().equals(user.getPasswordcopy())) {
//				resultCount = -1;
//				resultpassword = "两次密码必须一致";
//				model.addAttribute("resultpassword", resultpassword);
//			}
//			if (bindingResult.hasFieldErrors()&&(user.getPassword().equals("") && user.getPasswordcopy().equals(""))) {
//				resultCount = -1;
//				resultpassword = "两次密码必须一致";
//				model.addAttribute("resultpassword", resultpassword);
//			}
//			if (bindingResult.hasFieldErrors()) {
//				resultCount = -1;
//			}
//			if (resultCount > 0) {
//				resultCount = userService.update(user);
//				result.setCode(0);
//				result.setMsg("更新成功");
//			} 
//			else {
//				System.out.println("1");
//				System.out.println(user);
//				result.setCode(-1);
//				result.setMsg("更新失败");
//			}
//		} catch (Exception e) {
//			System.out.println("2");
//			System.out.println(user);
//			result.setCode(-1);
//			result.setMsg("更新失败");
//			e.printStackTrace();
//		}
//
//		model.addAttribute("user", user);
//		model.addAttribute("result", result);
//
//		return "informationChange";
//	}
	
	
	
		
	@RequestMapping(value = "/index", produces = "text/html;charset=utf-8")
	public String index() {
		return "user";
	}
	
		
}
