package com.electify.validation.annotations;

import com.electify.validation.validators.DateValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = DateValidator.class)
public @interface Date {
    String message() default "Unacceptable date format (dd-MM-yyyy)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
