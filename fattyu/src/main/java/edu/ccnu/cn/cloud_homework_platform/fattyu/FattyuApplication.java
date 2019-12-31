package edu.ccnu.cn.cloud_homework_platform.fattyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class FattyuApplication {

    public static void main(String[] args) {
        SpringApplication.run(FattyuApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
