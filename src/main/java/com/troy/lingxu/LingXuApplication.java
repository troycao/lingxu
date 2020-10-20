package com.troy.lingxu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author caoqiang
 */
@ServletComponentScan
@SpringBootApplication
@MapperScan("com.troy.lingxu.dao.mapper")
public class LingXuApplication {

    public static void main(String[] args) {
        SpringApplication.run(LingXuApplication.class, args);
    }
}
