package edu.ccnu.cn.cloud_homework_platform.fattyu.repo;

import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepo extends JpaRepository<Student,Integer> {
    Student findByNumber(String number);
}
