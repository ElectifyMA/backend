package com.electify.validation.annotations;

import com.electify.validation.validators.CinValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = CinValidator.class)
public @interface Cin {
    String message() default "Please Enter a valid cin code format (Ex: XX999999)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
