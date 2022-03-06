package com.company.task01.comparator;

import com.company.task01.entity.CustomArray;
import com.company.task01.service.CustomArrayFindService;
import com.company.task01.service.impl.CustomArrayFindServiceImpl;

import java.util.Comparator;

public class CustomArraySumComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        int sum1 = calculateSum(o1);
        int sum2 = calculateSum(o2);
        return Integer.compare(sum1, sum2);
    }

    private int calculateSum(CustomArray customArray) {
        CustomArrayFindService customArrayFindService = new CustomArrayFindServiceImpl();
        return customArrayFindService.findSum(customArray);
    }
}
