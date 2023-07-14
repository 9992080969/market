package com.voronov.market.util;

import com.voronov.market.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Alexey Voronov on 11.07.2023
 */
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;


    }
}