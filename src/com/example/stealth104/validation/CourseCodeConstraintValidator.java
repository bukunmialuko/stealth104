package com.example.stealth104.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String theString, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if (theString != null) {
            result = theString.startsWith(coursePrefix);
        }
        else {
            result = true;
        }

        return result;
    }
}
