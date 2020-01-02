package edu.ccnu.cn.cloud_homework_platform.fattyu.repo;



import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.HomeWork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkRepo extends JpaRepository<HomeWork,Integer> {
}
