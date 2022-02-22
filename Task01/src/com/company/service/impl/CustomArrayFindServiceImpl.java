package com.company.service.impl;

import com.company.entity.CustomArray;
import com.company.exception.CustomException;
import com.company.service.CustomArrayFindService;
import java.util.stream.IntStream;

public class CustomArrayFindServiceImpl implements CustomArrayFindService {

    @Override
    public int findMin(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        CustomException.arrayLengthCheck(array);
        //        IntStream.of(array).min();
        int min = array[0];
        for(int anArray : array) {
            if(min > anArray) {
                min = anArray;
            }
        }
        return min;
    }

    @Override
    public int findMax(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        CustomException.arrayLengthCheck(array);
        //        IntStream.of(array).max();
        int max = array[0];
        for(int anArray : array) {
            if(max < anArray) {
                max = anArray;
            }
        }
        return max;
    }

    @Override
    public int findSum(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        CustomException.arrayLengthCheck(array);
        return IntStream.of(array).sum();
    }

    @Override
    public double findAverage(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        CustomException.arrayLengthCheck(array);
        //        IntStream.of(array).average();
        return (double) findSum(customArray) / (array.length);
    }

    @Override
    public int findSumOfPositiveArguments(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        CustomException.arrayLengthCheck(array);
        return IntStream.of(array).filter(a -> a > 0).sum();
    }

    @Override
    public int findSumOfNegativeArguments(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        CustomException.arrayLengthCheck(array);
        return IntStream.of(array).filter(a -> a < 0).sum();
    }
}
