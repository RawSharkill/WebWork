package edu.ccnu.cn.cloud_homework_platform.fattyu.repo;


import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepo extends JpaRepository<Record,Integer> {
}
