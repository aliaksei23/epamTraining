package com.company.task01.service.impl;

import com.company.task01.entity.CustomArray;
import com.company.task01.service.CustomArrayReplaceArgService;
import com.company.task01.service.impl.CustomArrayReplaceArgServiceImpl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayReplaceArgServiceImplTest {

    private CustomArray customArray;
    private CustomArrayReplaceArgService customArrayReplaceArgServiceService;

    @BeforeClass
    public void createParameters() {
        customArray = new CustomArray(new int[]{-5, 2, 4, -10, 18});
        customArrayReplaceArgServiceService = new CustomArrayReplaceArgServiceImpl();
    }

    @Test
    public void testReplaceArguments() {
        int[] ints = customArrayReplaceArgServiceService.replaceArguments(customArray, 0);
        int[] expected = new int[]{0, 2, 4, 0, 18};
        assertEquals(expected, ints);
    }
}