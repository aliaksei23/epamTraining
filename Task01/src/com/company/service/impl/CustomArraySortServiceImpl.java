package com.company.service.impl;

import com.company.entity.CustomArray;
import com.company.exception.CustomException;
import com.company.service.CustomArraySortService;

public class CustomArraySortServiceImpl implements CustomArraySortService {

    @Override
    public int[] bubbleSort(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        CustomException.arrayLengthCheck(array);

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    @Override
    public int[] selectionSort(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        CustomException.arrayLengthCheck(array);

        for(int left = 0; left < array.length; left++) {
            int minInd = left;
            for(int i = left; i < array.length; i++) {
                if(array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            int temp = array[left];
            array[left] = array[minInd];
            array[minInd] = temp;
        }
        return array;
    }
}
