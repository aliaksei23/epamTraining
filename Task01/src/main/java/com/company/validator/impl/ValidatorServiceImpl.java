package com.company.validator.impl;

import com.company.validator.ValidatorService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class ValidatorServiceImpl implements ValidatorService<String> {

    private static final Logger logger = LogManager.getLogger(ValidatorServiceImpl.class);

    private static final Pattern NUMBER_CHECKER = Pattern.compile("[-?\\d+\\s+[,]]+");

    @Override
    public boolean isValid(String s) {
        boolean matches = s.matches(NUMBER_CHECKER.pattern());
        logger.debug("String {} consist of only numbers",matches);
        return matches;
    }
}
