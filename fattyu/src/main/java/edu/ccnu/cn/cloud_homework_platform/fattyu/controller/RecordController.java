package edu.ccnu.cn.cloud_homework_platform.fattyu.controller;

import edu.ccnu.cn.cloud_homework_platform.fattyu.Constants;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.*;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Class;
import edu.ccnu.cn.cloud_homework_platform.fattyu.model.UserSession;
import edu.ccnu.cn.cloud_homework_platform.fattyu.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/record")
public class RecordController {


    @Autowired
    private RecordRepo recordRepo;
    @Autowired
    private ClassRepo classRepo;
    @Autowired
    private ClassTeacherRepo classTeacherRepo;
    @Autowired
    private TeacherRepo teacherRepo;
    @Autowired
    private WorkStudentClassRepo workStudentClassRepo;

    @RequestMapping("/theClass")
    public String theClass(){
        return "the_class";
    }


    @ResponseBody
    @RequestMapping("/all/")
    public List<ClassRecordModel> getMyRecord(HttpSession httpSession) {
        UserSession user = (UserSession) httpSession.getAttribute(Constants.USE_SESSION_KEY);
        List<ClassRecordModel> models = new LinkedList<>();
        List<WorkStudentClass> classes = workStudentClassRepo.findByStudentId(user.getId());
        for (WorkStudentClass w : classes) {
            Class c = classRepo.findById(w.getClassId()).get();
            String className = c.getClassName();
            int teacherId = teacherRepo.findByTeacherName("morty").getTeacherId();
            String intro = c.getIntro();
            long time = c.getTime();
            int score = recordRepo.findByStudentIdAndClassId(user.getId(),c.getClassId()).getScore();
            ClassRecordModel classRecordModel = new ClassRecordModel(className, "morty", time, "必修课", score);
            models.add(classRecordModel);
        }

        return models;
    }
}
