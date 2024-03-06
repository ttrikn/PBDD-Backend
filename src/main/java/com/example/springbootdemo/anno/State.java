package com.example.springbootdemo.anno;

import com.example.springbootdemo.validation.StateValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotEmpty;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(
        validatedBy = {StateValidation.class}
)
public @interface State {
    //提供校验失败之后的提示信息
    String message() default "state参数的值只能是已发布或草稿";

    //指定分组
    Class<?>[] groups() default {};

    //获取到注解的附加信息
    Class<? extends Payload>[] payload() default {};
}
