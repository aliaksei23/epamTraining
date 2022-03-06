package com.company.task01.repository.impl;

import com.company.task01.entity.CustomArray;
import com.company.task01.repository.CustomArraySpecification;
import com.company.task01.service.CustomArrayFindService;
import com.company.task01.service.impl.CustomArrayFindServiceImpl;

public class MinAmountBetweenCustomArraySpecification implements CustomArraySpecification {

    private int fromMin;
    private int tillMin;

    public MinAmountBetweenCustomArraySpecification(int fromMin, int tillMin) {
        this.fromMin = fromMin;
        this.tillMin = tillMin;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        CustomArrayFindService customArrayFindService = new CustomArrayFindServiceImpl();
        int min = customArrayFindService.findMin(customArray);
        return min > fromMin && min < tillMin;
    }
}
