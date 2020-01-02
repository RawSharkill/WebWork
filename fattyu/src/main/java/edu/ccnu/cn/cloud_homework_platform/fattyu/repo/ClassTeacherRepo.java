package edu.ccnu.cn.cloud_homework_platform.fattyu.repo;

import java.util.List;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.ClassTeacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassTeacherRepo extends JpaRepository<ClassTeacher,Integer> {
    ClassTeacher findByClassIdAndTeacherId(int classId, int teacherId);
}
