package com.company.task01.service;

import com.company.task01.entity.CustomArray;

public interface CustomArraySortService {

    int[] bubbleSort(CustomArray customArray);

    int[] selectionSort(CustomArray customArray);

    int[] insertionSort(CustomArray customArray);
}
