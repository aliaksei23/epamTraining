package com.company.task01.comparator;

import com.company.task01.entity.CustomArray;
import com.company.task01.service.CustomArrayFindService;
import com.company.task01.service.impl.CustomArrayFindServiceImpl;

import java.util.Comparator;

public class CustomArrayAverageComparator implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        double average1 = calculateAverage(o1);
        double average2 = calculateAverage(o2);
        return Double.compare(average1,average2);
    }

    private double calculateAverage(CustomArray customArray) {
        CustomArrayFindService customArrayFindService = new CustomArrayFindServiceImpl();
        return customArrayFindService.findAverage(customArray);
    }
}
