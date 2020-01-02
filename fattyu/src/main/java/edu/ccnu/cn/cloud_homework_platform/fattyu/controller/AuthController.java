package edu.ccnu.cn.cloud_homework_platform.fattyu.controller;


import edu.ccnu.cn.cloud_homework_platform.fattyu.Constants;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Student;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Teacher;
import edu.ccnu.cn.cloud_homework_platform.fattyu.model.UserSession;
import edu.ccnu.cn.cloud_homework_platform.fattyu.repo.StudentsRepo;
import edu.ccnu.cn.cloud_homework_platform.fattyu.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AuthController {

    @Autowired
    StudentsRepo studentsRepo;

    @Autowired
    TeacherRepo teacherRepo;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/dologin")
    public String dologin(HttpSession session, HttpServletRequest httpServletRequest){
        String name=httpServletRequest.getParameter("name");
        String password = httpServletRequest.getParameter("password");

        String node1=httpServletRequest.getParameter("teacher");
        String node2=httpServletRequest.getParameter("student");

        int id=1;
        int type=0;
        int result=0;
        if(node2==null){
            List<Teacher> teachers=teacherRepo.findAllByNumber(name);
            if(!teachers.isEmpty()) {
                id = teachers.get(0).getTeacherId();
                type = 1;
                String pass = teachers.get(0).getPassword();
                if (pass.equals(password))
                    result = 1;
            }
        }
        else {
                Student student = studentsRepo.findByNumber(name);
                id = student.getStudentId();
                type = 2;
                if(student != null) {
                    String pass = student.getPassword();
                    if (pass.equals(password))
                        result = 1;
                }
        }
        UserSession userSession=new UserSession();
        if(result==1)
        {
            userSession.setId(id);
            userSession.setName(name);
            userSession.setNode(type);
            userSession.setPassword(password);
            session.setAttribute(Constants.USE_SESSION_KEY,userSession);
            return "homepage";
        }
        else
            return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/doregister")
    public String doregister(HttpServletRequest request){
        String number=request.getParameter("number");
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String node1=request.getParameter("teacher");
        String node2=request.getParameter("student");

        if(node2==null){
            Teacher teacher=new Teacher(name,number,"pp",1,password);
//            if(teacherRepo.findAllByNumber(number)==null)
//            {
                teacherRepo.save(teacher);
                return "login";
//            }
//            else
//                return "register";
        }
        else{
            Student student=new Student(name,number,"ppp",0,password);
//            if(studentsRepo.findAllByNumber(number)==null)
//            {
                studentsRepo.save(student);
                return "login";
//            }
//            else
//                return "register";
        }

    }

    @RequestMapping("/homepage")
    public String homepage(){
        return "homepage";
    }
}
