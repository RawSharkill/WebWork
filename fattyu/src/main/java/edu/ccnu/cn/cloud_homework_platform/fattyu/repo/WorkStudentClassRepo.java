package edu.ccnu.cn.cloud_homework_platform.fattyu.repo;

import java.util.List;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.WorkStudentClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkStudentClassRepo extends JpaRepository<WorkStudentClass,Integer> {

    List<WorkStudentClass> findByStudentIdAndClassId(int studentId,int classId);
    List<WorkStudentClass> findByStudentId(int studentId);
}
