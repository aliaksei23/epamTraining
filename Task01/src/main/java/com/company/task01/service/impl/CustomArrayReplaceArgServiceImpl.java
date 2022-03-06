package com.company.task01.service.impl;

import com.company.task01.entity.CustomArray;
import com.company.task01.exception.CustomException;
import com.company.task01.service.CustomArrayReplaceArgService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CustomArrayReplaceArgServiceImpl implements CustomArrayReplaceArgService {

    private static final Logger logger = LogManager.getLogger(CustomArrayReplaceArgServiceImpl.class);

    @Override
    public int[] replaceArguments(CustomArray customArray, int replacement) {
        checkIfArrayExist(customArray);
        int[] array = customArray.getCustomArray();

        IntStream.of(array).filter(a -> a < 0).forEach(a -> a = replacement);

        for(int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                array[i] = replacement;
            }
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
