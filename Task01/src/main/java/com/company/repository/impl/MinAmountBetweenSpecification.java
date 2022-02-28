package com.company.repository.impl;

import com.company.entity.CustomArray;
import com.company.repository.Specification;
import com.company.service.CustomArrayFindService;
import com.company.service.impl.CustomArrayFindServiceImpl;

public class MinAmountBetweenSpecification implements Specification {

    private int min1;
    private int min2;
    private CustomArrayFindService customArrayFindService = new CustomArrayFindServiceImpl();

    public MinAmountBetweenSpecification(int min1, int mi2) {
        this.min1 = min1;
        this.min2 = mi2;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int min = customArrayFindService.findMin(customArray);
        if (min > min1 && min < min2) {
            return true;
        }
        return false;
    }
}
