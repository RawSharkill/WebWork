package edu.ccnu.cn.cloud_homework_platform.fattyu.controller;

import edu.ccnu.cn.cloud_homework_platform.fattyu.Constants;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.HomeWork;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Student;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Teacher;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.WorkStudentClass;
import edu.ccnu.cn.cloud_homework_platform.fattyu.repo.*;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("test")
public class TestController {


    @Autowired
    private HomeworkRepo homeworkRepo;
    @Autowired
    private StudentsRepo studentsRepo;
    @Autowired
    private TeacherRepo teacherRepo;
    @Autowired
    private ClassRepo classRepo;
    @Autowired
    private WorkStudentClassRepo workStudentClassRepo;

    @RequestMapping("/2")
    public void inject(){
        HomeWork homeWork1 = new HomeWork("this is some fucking shit!");
        HomeWork homeWork2 = new HomeWork("this is some fucking shit!");
        HomeWork homeWork3 = new HomeWork("this is some fucking shit!");
        HomeWork homeWork4 = new HomeWork("this is some fucking shit!");

        homeworkRepo.save(homeWork1);
        homeworkRepo.save(homeWork2);
        homeworkRepo.save(homeWork3);
        homeworkRepo.save(homeWork4);

        Class c1 = new Class("班级1",System.currentTimeMillis(),"这是班级1");
        classRepo.save(c1);

        Student rick = new Student("rick","123","rick city", Constants.STUDNET,"rickpass");
        studentsRepo.save(rick);


        Teacher morty = new Teacher("morty","123","rick city", Constants.TEACHER,"mortypass");
        teacherRepo.save(morty);


        WorkStudentClass workStudentClass1 = new WorkStudentClass(rick.getStudentId(),c1.getClassId(),homeWork1.getHomeWorkId());
        WorkStudentClass workStudentClass2 = new WorkStudentClass(rick.getStudentId(),c1.getClassId(),homeWork2.getHomeWorkId());
        WorkStudentClass workStudentClass3 = new WorkStudentClass(rick.getStudentId(),c1.getClassId(),homeWork3.getHomeWorkId());
        WorkStudentClass workStudentClass4 = new WorkStudentClass(rick.getStudentId(),c1.getClassId(),homeWork4.getHomeWorkId());

        workStudentClassRepo.save(workStudentClass1);
        workStudentClassRepo.save(workStudentClass2);
        workStudentClassRepo.save(workStudentClass3);
        workStudentClassRepo.save(workStudentClass4);


    }
}
