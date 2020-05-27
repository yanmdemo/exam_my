package com.exam_ym.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.exam_ym.mapper.dao")
public class ExamYmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamYmApplication.class, args);
    }

}
