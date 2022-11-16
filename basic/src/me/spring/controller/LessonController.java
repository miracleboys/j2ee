package me.spring.controller;

import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import me.spring.bean.Student;

@Controller
@RequestMapping("/less")
public class LessonController {
	SimpleDateFormat simpleTextFormatter = new SimpleDateFormat("yyy-MM-dd");
	
    @RequestMapping(value = "/list")
    public String list(Model model) throws Exception {
        model.addAttribute("locales",Locale.getAvailableLocales());
        return "locale/list";
    }
    
    @RequestMapping(value = "/myUI")
    public String myUI(Model model) throws Exception {    
        Student student = new Student();
        student.setCode("0000001");
        student.setName("张三");
        student.setGender(1);
        model.addAttribute("student", student);
        model.addAttribute("locale",Locale.getDefault());
        return "locale/myUI";
        
    }

    @RequestMapping(value = "/myUIBySelect")
    public String myUIBySelect(@RequestParam(defaultValue="zh_CN") String lang,HttpServletRequest request, Model model) throws Exception {    
        String[] langSplit = lang.split("_"); 
        Locale locale = new Locale(langSplit[0],langSplit[1]);
        request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME , locale);
        Student student = new Student();        
        model.addAttribute("student", student);
        model.addAttribute("locale",locale);
        model.addAttribute("lang",lang);            
        return "locale/myUIBySelect";
    }
    @RequestMapping(value = "/myUIBySelectSubmit")
    public String myUIBySelectSubmit(@Valid Student student,BindingResult bindingResult, @RequestParam(defaultValue="zh_CN") String lang,HttpServletRequest request, Model model) throws Exception {  
        String[] langSplit = lang.split("_"); 
        Locale locale = new Locale(langSplit[0],langSplit[1]);
        request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME , locale);
        model.addAttribute("student", student);
        model.addAttribute("locale",locale);
        model.addAttribute("lang",lang);
        return "locale/myUIBySelect";
    }
}

