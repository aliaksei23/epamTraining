package com.company.service;

import com.company.entity.CustomArray;

public interface CustomArrayFindService {

    int findMin(CustomArray customArray);

    int findMax(CustomArray customArray);

    int findSum(CustomArray customArray);

    double findAverage(CustomArray customArray);

    int findSumOfPositiveArguments(CustomArray customArray);

    int findSumOfNegativeArguments(CustomArray customArray);
}
