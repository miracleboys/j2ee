package me.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import me.spring.bean.Result;
import me.spring.entity.User;
import me.spring.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/list", produces = "application/json;charset=utf-8")  
    //@ResponseBody
    public String list(User user, Model model) {
        Result result = new Result(); 
        result.setCode(0);
        result.setMsg("查询成功");
        result.setData(userService.listAll());
        user = userService.getById(user);
        if(user==null) {
            user = new User();
        }
        model.addAttribute("user", user);
        model.addAttribute("result", result);
        return "list";
    }
    @RequestMapping(value ="/add", produces = "application/json;charset=utf-8") 
   // @ResponseBody
    public String add(User user, Model model) {
        Result result = new Result(); 
        try {          
            int resultCount = userService.add(user);
            if (resultCount>0) {
                result.setCode(0);
                result.setMsg("添加成功");              
            }else {
                result.setCode(-1);
                result.setMsg("添加失败");
            }
            result.setData(resultCount);
        }catch(Exception e) {
            result.setCode(-1);
            result.setMsg("添加失败");
            result.setData(e.getLocalizedMessage());
        }
        model.addAttribute("user", user);
        model.addAttribute("result", result);
        return "list";
    }
    @RequestMapping("/update")
    //@ResponseBody
    public String update(User user, Model model) {
        Result result = new Result(); 
        try {      
            int resultCount = userService.update(user);          
            if (resultCount>0) {
                result.setCode(0);
                result.setMsg("更新成功");      
            }else {
                result.setCode(-1);
                result.setMsg("更新失败");
            }
            result.setData(resultCount);
        }catch(Exception e) {
            result.setCode(-1);
            result.setMsg("更新失败");
            result.setData(e.getLocalizedMessage());
        }
        model.addAttribute("user", user);
        model.addAttribute("result", result);
        return "list";
    }
    @RequestMapping("/delete")
    //@ResponseBody
    public String delete(User user, Model model) {
        Result result = new Result(); 
        try {      
            int resultCount = userService.delete(user);          
            if (resultCount>0) {
                result.setCode(0);
                result.setMsg("删除成功");      
            }else {
                result.setCode(-1);
                result.setMsg("删除失败");
            }
            result.setData(resultCount);
        }catch(Exception e) {
            result.setCode(-1);
            result.setMsg("删除失败");
            result.setData(e.getLocalizedMessage());
        }
        model.addAttribute("user", user);
        model.addAttribute("result", result);
        return "list";
    }

@RequestMapping(value = "/updateSet", produces = "text/html;charset=utf-8")
public String updateSet(User user, Model model) {
    Result result = new Result();
    result.setCode(0);
    result.setMsg("更新成功");
    try {
        userService.updateSet(user);            
    } catch (Exception e) {
        result.setCode(-1);
        result.setMsg("更新失败");
        e.printStackTrace();
    }
    result.setData(userService.listAll());      
    model.addAttribute("user", user);
    model.addAttribute("result", result);
    return "listUpdateSet";
}

@RequestMapping(value = "/changeUsername", produces = "text/html;charset=utf-8")   
public String changeUsername(User user, Model model) {
    Result result = new Result();
    try {
        result = userService.changeUsername(user);
    } catch (Exception e) {
        result.setCode(-1);
        result.setMsg("更新失败");
        e.printStackTrace();             
    }
    result.setData(userService.listAll());
    model.addAttribute("user", user);
    model.addAttribute("result", result);
    return "listOnly";
}

}