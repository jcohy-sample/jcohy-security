package com.jcohy.validator;

import com.jcohy.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Copyright  : 2017- www.jcohy.com
 * Created by jiac on 0:08 2018/8/8
 * Email: jia_chao23@126.com
 * ClassName: MyConstraintValidator
 * Description:
 **/
public class MyConstraintValidator implements ConstraintValidator<MyValidConstraint,Object>{

    //可以注入Spring容器中任何东西来执行校验逻辑
    @Autowired
    private HelloService helloService;
    @Override
    public void initialize(MyValidConstraint constraintAnnotation) {
        System.out.println("my validator init");
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        helloService.greeting("tom");
        System.out.println(value);
        return true;
    }
}
