package com.xiaobai.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.xiaobai.demo.Mapper")
@SpringBootApplication
public class DemoApplication {
//4564
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
