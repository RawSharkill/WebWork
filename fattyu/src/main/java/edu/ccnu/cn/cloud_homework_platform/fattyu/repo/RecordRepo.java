package edu.ccnu.cn.cloud_homework_platform.fattyu.repo;


import java.util.List;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepo extends JpaRepository<Record,Integer> {
    Record findByStudentIdAndClassId(int studentId, int classId);
}
