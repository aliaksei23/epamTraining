package com.company.task01.service;

import com.company.task01.entity.CustomArray;

public interface CustomArrayFindService {

    int findMin(CustomArray customArray);

    int findMax(CustomArray customArray);

    int findSum(CustomArray customArray);

    double findAverage(CustomArray customArray);

    int findSumOfPositiveArguments(CustomArray customArray);

    int findSumOfNegativeArguments(CustomArray customArray);
}
