package com.company.service.impl;

import com.company.service.ValidatorService;

import java.util.regex.Pattern;

public class ValidatorImpl implements ValidatorService {

    private static final Pattern NUMBER_CHECKER = Pattern.compile("[-?[0-9]+\\s+|,|]+");

    @Override
    public boolean isValid(String s) {
        return s.matches(NUMBER_CHECKER.pattern());
    }
}
