package edu.ccnu.cn.cloud_homework_platform.fattyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/record")
public class RecordController {
    @RequestMapping("/theClass")
    public String theClass(){
        return "the_class";
    }
}
