package com.java1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-10-10 19:38
 */
@Controller
public class IndexController {

    /**
     * 网站根目录请求
     * @return
     */
    @RequestMapping("/")
    public ModelAndView root(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

}
