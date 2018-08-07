package com.jcohy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright  : 2017- www.jcohy.com
 * Created by jiac on 23:48 2018/8/7
 * Email: jia_chao23@126.com
 * ClassName: JcohyApplication
 * Description:
 **/
@SpringBootApplication
@RestController
@EnableSwagger2
public class JcohyApplication {

    public static void main(String[] args){
        SpringApplication.run(JcohyApplication.class,args);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
