package me.spring.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.spring.bean.Result;
import me.spring.entity.UserView;
import me.spring.service.UserViewService;
@Controller
@RequestMapping("/user")
public class UserViewController {
    @Autowired
    UserViewService userViewService;
    


	@RequestMapping(value = "/listDynamic", produces = "text/html;charset=utf-8")
	public String listDynamic(UserView userView, Model model) {
	    Result result = new Result();
	    result.setCode(0);
	    result.setMsg("查询成功");              
	    List<UserView> userViews= userViewService.listIf(userView);
	    result.setData(userViews);      
	    model.addAttribute("result", result);
	    return "listDynamic";
	}
       
    // 数据库查询
    @RequestMapping(value = "/listView", produces = "text/html;charset=utf-8")
    public String listView(UserView userView, Model model) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("查询成功");              
        List<UserView> userViews= userViewService.listSome(userView);
        result.setData(userViews);
//        userView.setCaption(userView.getCaption().replace("%", ""));
        model.addAttribute("userView", userView);
        model.addAttribute("result", result);
        return "listView";
    }
    

	@RequestMapping(value = "/listDynamic", produces = "text/html;charset=utf-8")
	public String listDynamic(UserView userView, Model model) {
	    Result result = new Result();
	    result.setCode(0);
	    result.setMsg("查询成功");              
	    List<UserView> userViews= userViewService.listChoose(userView);
	    result.setData(userViews);      
	    model.addAttribute("result", result);
	    return "listDynamic";
	}
	


	@RequestMapping(value = "/listDynamic", produces = "text/html;charset=utf-8")
	public String listDynamic(@RequestParam("id") List list, Model model) {
	    Result result = new Result();
	    result.setCode(0);
	    result.setMsg("查询成功");
	    List<UserView> userViews = userViewService.listCollection(list);
	    result.setData(userViews);
	    model.addAttribute("result", result);
	    return "listDynamic";
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
}