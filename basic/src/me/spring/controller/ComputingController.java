package me.spring.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
 
import me.spring.service.ComputingService;
 
@Controller
@RequestMapping("/computing")
public class ComputingController {
    //自动注入 获取接口 少了的东西由框架完成 找到接口里至少一个实现 否则此处报错
	//模糊性 若有多个类实现了接口 则可能报错 实现类中有一个@Service则作为候选类不写则不是
	@Autowired
    ComputingService computingService;
     
    @RequestMapping(value = "/triangle", produces = "text/html;charset=utf-8") 
    @ResponseBody
    public String triangle(@RequestParam List<Double> params) {
        return Double.toString(computingService.area(params)); //必须使用接口 直接使用实现方法不给分
    }
}