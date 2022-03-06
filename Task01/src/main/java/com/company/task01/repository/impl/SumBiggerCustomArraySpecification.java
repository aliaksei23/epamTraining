package com.company.task01.repository.impl;

import com.company.task01.entity.CustomArray;
import com.company.task01.repository.CustomArraySpecification;
import com.company.task01.service.CustomArrayFindService;
import com.company.task01.service.impl.CustomArrayFindServiceImpl;

public class SumBiggerCustomArraySpecification implements CustomArraySpecification {
    private int givenSum;

    public SumBiggerCustomArraySpecification(int givenSum) {
        this.givenSum = givenSum;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        CustomArrayFindService customArrayFindService = new CustomArrayFindServiceImpl();
        boolean result = customArrayFindService.findSum(customArray) >= givenSum;
        return result;
    }
}
