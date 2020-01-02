package edu.ccnu.cn.cloud_homework_platform.fattyu.controller;

import java.util.List;
import edu.ccnu.cn.cloud_homework_platform.fattyu.dao.Record;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/record")
public class RecordController {


    @RequestMapping("/theClass")
    public String theClass(){
        return "the_class";
    }


    @ResponseBody
    @RequestMapping("/class/{id}")
    public List<Record> getMyRecord(@PathVariable("id") int id){

    }
}
