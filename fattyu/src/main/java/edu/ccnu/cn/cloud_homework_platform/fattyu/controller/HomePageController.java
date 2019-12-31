package edu.ccnu.cn.cloud_homework_platform.fattyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("homepage")
public class HomePageController {
    @RequestMapping("/record")
    public String record(){
        return "record";
    }

    @RequestMapping("/class")
    public String clas(){
        return "class";
    }
    @RequestMapping("/my")
    public String my(){
        return "my";
    }

}
