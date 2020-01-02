package edu.ccnu.cn.cloud_homework_platform.fattyu.repo;

import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
    Teacher  findByTeacherName(String teacherName);
    List<Teacher> findAllByNumber(String number);
}
