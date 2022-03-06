package com.company.task01.service.impl;

import com.company.task01.entity.CustomArray;
import com.company.task01.service.CustomArrayFindService;
import com.company.task01.service.impl.CustomArrayFindServiceImpl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CustomArrayFindServiceImplTest {
    private CustomArray customArray;
    private CustomArrayFindService customArrayFindService;

    @BeforeClass
    public void createParameters() {
        customArray = new CustomArray(new int[]{-5, 2, 4, -10, 18});
        customArrayFindService = new CustomArrayFindServiceImpl();
    }

    @Test
    public void testFindMin() {
        assertEquals(-10, customArrayFindService.findMin(customArray));
    }

    @Test
    public void testFindMax() {
        assertEquals(18, customArrayFindService.findMax(customArray));
    }

    @Test
    public void testFindSum() {
        int sum = customArrayFindService.findSum(customArray);
        assertEquals(9, sum);
    }

    @Test
    public void testFindAverage() {
        double average = customArrayFindService.findAverage(customArray);
        assertEquals(1.8, average);
    }

    @Test
    public void testFindSumOfPositiveArguments() {
        int sumOfPositiveArguments = customArrayFindService.findSumOfPositiveArguments(customArray);
        assertEquals(24, sumOfPositiveArguments);
    }

    @Test
    public void testFindSumOfNegativeArguments() {
        int sumOfNegativeArguments = customArrayFindService.findSumOfNegativeArguments(customArray);
        assertEquals(-15, sumOfNegativeArguments);
    }
}