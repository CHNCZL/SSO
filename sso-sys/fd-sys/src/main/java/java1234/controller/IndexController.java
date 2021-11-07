package java1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-10-08 19:44
 */
@Controller
public class IndexController {

    /**
     * 网站根目录请求
     * @return
     */
    @RequestMapping("/fd")
    public ModelAndView root(HttpSession session){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    /**
     * 注销
     * @return
     */
    @RequestMapping("/logout")
    public String logout(){
        return "redirect:https://java1234.com:8443/cas/logout";
    }
}
