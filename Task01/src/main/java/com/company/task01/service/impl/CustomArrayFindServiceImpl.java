package com.company.task01.service.impl;

import com.company.task01.entity.CustomArray;
import com.company.task01.exception.CustomException;
import com.company.task01.service.CustomArrayFindService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CustomArrayFindServiceImpl implements CustomArrayFindService {

    private static final Logger logger = LogManager.getLogger(CustomArrayFindServiceImpl.class);

    @Override
    public int findMin(CustomArray customArray) {
        checkIfArrayExist(customArray);
        int[] array = customArray.getCustomArray();
        int min = IntStream.of(array).min().getAsInt();
        return min;
    }

    @Override
    public int findMax(CustomArray customArray) {
        checkIfArrayExist(customArray);
        int[] array = customArray.getCustomArray();
        int max = IntStream.of(array).max().getAsInt();
        return max;
    }

    @Override
    public int findSum(CustomArray customArray) {
        checkIfArrayExist(customArray);
        int[] array = customArray.getCustomArray();
        return IntStream.of(array).sum();
    }

    @Override
    public double findAverage(CustomArray customArray) {
        checkIfArrayExist(customArray);
        int[] array = customArray.getCustomArray();
        double average = IntStream.of(array).average().getAsDouble();
        return average;
    }

    @Override
    public int findSumOfPositiveArguments(CustomArray customArray) {
        checkIfArrayExist(customArray);
        int[] array = customArray.getCustomArray();
        return IntStream.of(array).filter(a -> a > 0).sum();
    }

    @Override
    public int findSumOfNegativeArguments(CustomArray customArray) {
        checkIfArrayExist(customArray);
        int[] array = customArray.getCustomArray();
        return IntStream.of(array).filter(a -> a < 0).sum();
    }

    private void checkIfArrayExist(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        try {
            if (array.length == 0) {
                logger.error("CustomArray is empty" + Arrays.toString(array));
                throw new CustomException("CustomArray is empty" + Arrays.toString(array));
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
