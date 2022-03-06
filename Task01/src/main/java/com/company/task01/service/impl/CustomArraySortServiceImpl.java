package com.company.task01.service.impl;

import com.company.task01.entity.CustomArray;
import com.company.task01.exception.CustomException;
import com.company.task01.service.CustomArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArraySortServiceImpl implements CustomArraySortService {

    private static final Logger logger = LogManager.getLogger(CustomArraySortServiceImpl.class);

    @Override
    public int[] bubbleSort(CustomArray customArray) {
        checkIfArrayExist(customArray);
        int[] array = customArray.getCustomArray();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
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
        checkIfArrayExist(customArray);
        int[] array = customArray.getCustomArray();

        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            int temp = array[left];
            array[left] = array[minInd];
            array[minInd] = temp;
        }
        return array;
    }

    @Override
    public int[] insertionSort(CustomArray customArray) {
        checkIfArrayExist(customArray);
        int[] array = customArray.getCustomArray();

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
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
