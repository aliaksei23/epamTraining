package com.company.repository.impl;

import com.company.entity.CustomArray;
import com.company.repository.Specification;
import com.company.service.CustomArrayFindService;
import com.company.service.impl.CustomArrayFindServiceImpl;

public class AverageLessSpecification implements Specification {
    private double givenAverage;
    private CustomArrayFindService customArrayFindService = new CustomArrayFindServiceImpl();

    public AverageLessSpecification(double givenAverage) {
        this.givenAverage = givenAverage;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        boolean result = customArrayFindService.findAverage(customArray) <= givenAverage;
        return result;
    }
}
