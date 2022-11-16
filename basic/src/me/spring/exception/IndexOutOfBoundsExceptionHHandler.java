package me.spring.exception;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

public class IndexOutOfBoundsExceptionHHandler {
@ExceptionHandler(IndexOutOfBoundsException.class)
public ModelAndView uploadException(IndexOutOfBoundsException e, HttpServletResponse response) {
	 ModelAndView modelAndView = new ModelAndView();
     modelAndView.addObject("code", -2);
     modelAndView.addObject("msg", "文件无法检索！");
     modelAndView.setViewName("exception/IndexOutOfBoundsException");
     return modelAndView;
}
}
