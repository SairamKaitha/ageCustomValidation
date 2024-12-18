package com.tt.customvalidaton.constrants;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = AgeValidation.class)
@Target({ElementType.FIELD})//applies to the field of class
@Retention(RetentionPolicy.RUNTIME)//it should  work on runtime
@Documented //based on all document must create
public @interface Age {
    String message() default "Age must be 18 years";
    Class<?> [] groups() default{};
    Class<? extends Payload> [] payload() default{};
}
