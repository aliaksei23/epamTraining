package com.company.task01.comparator;

import com.company.task01.entity.CustomArray;

import java.util.Comparator;

public class CustomArrayLengthComparator implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return Integer.compare(o1.getCustomArray().length, o2.getCustomArray().length);
    }
}
