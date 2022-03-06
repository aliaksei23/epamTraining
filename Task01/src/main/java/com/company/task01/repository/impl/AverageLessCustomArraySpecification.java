package com.company.task01.repository.impl;

import com.company.task01.entity.CustomArray;
import com.company.task01.repository.CustomArraySpecification;
import com.company.task01.service.CustomArrayFindService;
import com.company.task01.service.impl.CustomArrayFindServiceImpl;

public class AverageLessCustomArraySpecification implements CustomArraySpecification {
    private double givenAverage;

    public AverageLessCustomArraySpecification(double givenAverage) {
        this.givenAverage = givenAverage;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        CustomArrayFindService customArrayFindService = new CustomArrayFindServiceImpl();
        boolean result = customArrayFindService.findAverage(customArray) <= givenAverage;
        return result;
    }
}
