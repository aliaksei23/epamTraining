package com.company.repository.impl;

import com.company.entity.CustomArray;
import com.company.repository.Specification;
import com.company.service.CustomArrayFindService;
import com.company.service.impl.CustomArrayFindServiceImpl;

public class SumBiggerSpecification implements Specification {
    private int givenSum;
    private CustomArrayFindService customArrayFindService = new CustomArrayFindServiceImpl();

    public SumBiggerSpecification(int givenSum) {
        this.givenSum = givenSum;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        boolean result = customArrayFindService.findSum(customArray) >= givenSum;
        return result;
    }
}
