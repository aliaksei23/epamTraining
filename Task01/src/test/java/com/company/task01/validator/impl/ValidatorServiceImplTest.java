package com.company.task01.validator.impl;

import com.company.task01.validator.ValidatorService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidatorServiceImplTest {
    ValidatorService<String> validatorService = new ValidatorServiceImpl();
    String string = "-1_2, 3; -4 12";

    @Test
    public void testIsStringValid() {
        boolean valid = validatorService.isStringValid(string);
        assertTrue(valid);
    }
}