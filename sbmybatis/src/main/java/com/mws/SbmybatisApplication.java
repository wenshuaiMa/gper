package com.mws;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mws.dao")
public class SbmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmybatisApplication.class, args);
    }

}
