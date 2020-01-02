package edu.ccnu.cn.cloud_homework_platform.fattyu.controller;

import edu.ccnu.cn.cloud_homework_platform.fattyu.Constants;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.HomeWork;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Student;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.WorkStudentClass;
import edu.ccnu.cn.cloud_homework_platform.fattyu.model.UserSession;
import edu.ccnu.cn.cloud_homework_platform.fattyu.repo.HomeworkRepo;
import edu.ccnu.cn.cloud_homework_platform.fattyu.repo.StudentsRepo;
import edu.ccnu.cn.cloud_homework_platform.fattyu.repo.WorkStudentClassRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("homepage")
public class HomePageController {

    @Autowired
    public StudentsRepo studentsRepo;
    @Autowired
    private WorkStudentClassRepo wcsRepo;
    @Autowired
    private HomeworkRepo homeworkRepo;

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

    @ResponseBody
    @RequestMapping("/userinfo")
    public Student getmyinfo(HttpSession session){
        UserSession user=(UserSession)session.getAttribute(Constants.USE_SESSION_KEY);
        String name=user.getName();
        return studentsRepo.findByNumber(name);
    }

    @ResponseBody
    @RequestMapping("/homework")
    public List<HomeWork> getMyHomework(HttpSession session){
        UserSession user=(UserSession)session.getAttribute(Constants.USE_SESSION_KEY);
        int userId = user.getId();
        List<WorkStudentClass> wscs = wcsRepo.findByStudentId(userId);
        List<HomeWork> homeWork = new LinkedList<>();
        for(WorkStudentClass w:wscs){
            int homeWorkId = w.getHomeworkId();
            HomeWork h = homeworkRepo.findById(homeWorkId).get();
            homeWork.add(h);
        }

        return homeWork;
    }

}
