
package me.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/el")
public class ElController {
    @RequestMapping(value = "/index", produces = "text/html;charset=utf-8")
    public String index(@RequestParam(defaultValue="scope") String view) {     
        return view;
    }
    
    @RequestMapping(value = "/scopeForward", produces = "text/html;charset=utf-8")
    public String scopeForward() {       
        return "scopeForward";
    } 
}