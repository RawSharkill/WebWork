package edu.ccnu.cn.cloud_homework_platform.fattyu.controller;

import edu.ccnu.cn.cloud_homework_platform.fattyu.Constants;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Student;
import edu.ccnu.cn.cloud_homework_platform.fattyu.model.UserSession;
import edu.ccnu.cn.cloud_homework_platform.fattyu.repo.StudentsRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("homepage")
public class HomePageController {
    @Autowired
    public StudentsRepo studentsRepo;
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
    @RequestMapping("/back")
    public String back(){return "homepage";}

    @RequestMapping("/getmyinfo")
    public List<Student> getmyinfo(HttpSession session){
        UserSession user=(UserSession)session.getAttribute(Constants.USE_SESSION_KEY);
        String name=user.getName();
        return studentsRepo.findAllByNumber(name);
    }

}
