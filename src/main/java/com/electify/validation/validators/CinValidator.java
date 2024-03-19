package com.electify.validation.validators;

import com.electify.validation.annotations.Cin;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CinValidator implements ConstraintValidator<Cin, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) return false;
        if (value.length() != 8) return false;
        if (!Character.isLetter(value.charAt(0)) || !Character.isLetter(value.charAt(1))) return false;
        for (int i = 2; i < value.length(); i++) if (!Character.isDigit(value.charAt(i))) return false;

        return true;
    }
}
