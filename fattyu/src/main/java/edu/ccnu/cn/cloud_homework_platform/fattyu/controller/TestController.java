package edu.ccnu.cn.cloud_homework_platform.fattyu.controller;

import edu.ccnu.cn.cloud_homework_platform.fattyu.Constants;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.*;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Class;
import edu.ccnu.cn.cloud_homework_platform.fattyu.repo.*;
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
    @Autowired
    private RecordRepo recordRepo;
    @Autowired
    private ClassTeacherRepo classTeacherRepo;



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

        Class c2 = new Class("班级2",System.currentTimeMillis(),"这是班级12");
        classRepo.save(c2);

        Student rick = new Student("rick","123","rick city", Constants.STUDNET,"rickpass");
        studentsRepo.save(rick);


        Teacher morty = new Teacher("morty","123","rick city", Constants.TEACHER,"mortypass");
        teacherRepo.save(morty);

        Teacher summer = new Teacher("summer","123","rick city", Constants.TEACHER,"summerpass");
        teacherRepo.save(summer);


        WorkStudentClass workStudentClass1 = new WorkStudentClass(rick.getStudentId(),c1.getClassId(),homeWork1.getHomeWorkId());
        WorkStudentClass workStudentClass2 = new WorkStudentClass(rick.getStudentId(),c1.getClassId(),homeWork2.getHomeWorkId());
        WorkStudentClass workStudentClass3 = new WorkStudentClass(rick.getStudentId(),c1.getClassId(),homeWork3.getHomeWorkId());
        WorkStudentClass workStudentClass4 = new WorkStudentClass(rick.getStudentId(),c1.getClassId(),homeWork4.getHomeWorkId());

        workStudentClassRepo.save(workStudentClass1);
        workStudentClassRepo.save(workStudentClass2);
        workStudentClassRepo.save(workStudentClass3);
        workStudentClassRepo.save(workStudentClass4);

        Record record1 = new Record(rick.getStudentId(),c1.getClassId(),morty.getTeacherId(),99);
        Record record2 = new Record(rick.getStudentId(),c2.getClassId(),summer.getTeacherId(),100);

        recordRepo.save(record1);
        recordRepo.save(record2);


        ClassTeacher classTeacher = new ClassTeacher(c1.getClassId(),morty.getTeacherId());
        classTeacherRepo.save(classTeacher);
    }
}
