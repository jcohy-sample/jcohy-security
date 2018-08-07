package com.jcohy.validator;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Copyright  : 2017- www.jcohy.com
 * Created by jiac on 0:07 2018/8/8
 * Email: jia_chao23@126.com
 * ClassName: MyValidConstraint
 * Description:
 **/
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyConstraintValidator.class)
public @interface MyValidConstraint {
    //下面三个属性必写
    String message();

    Class[] groups() default { };

    Class[] payload() default { };
}
