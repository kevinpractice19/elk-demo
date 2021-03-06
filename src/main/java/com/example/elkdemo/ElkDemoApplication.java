package com.example.elkdemo;

import com.example.elkdemo.po.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
@RestController
public class ElkDemoApplication {

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(ElkDemoApplication.class, args);

        log.info("============启动成功================");
    }

    @GetMapping(value = "/test")
    public String test() throws InterruptedException {
        log.debug("测试");
        log.info("============请求成功================");
        return "成功";
    }

    public static  <T> T environment1(Class<T> environmentClass) throws IllegalAccessException, InstantiationException {
        T t = environmentClass.newInstance();
        return t;
    }


}
