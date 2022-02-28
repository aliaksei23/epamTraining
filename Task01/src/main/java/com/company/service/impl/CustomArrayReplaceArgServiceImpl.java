package com.company.service.impl;

import com.company.entity.CustomArray;
import com.company.exception.CustomException;
import com.company.service.CustomArrayReplaceArgService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class CustomArrayReplaceArgServiceImpl implements CustomArrayReplaceArgService {

    private static final Logger logger = LogManager.getLogger(CustomArrayReplaceArgServiceImpl.class);

    @Override
    public int[] replaceArguments(CustomArray customArray, int replacement) {
        int[] array = customArray.getCustomArray();
        CustomException.arrayLengthCheck(array);

        IntStream.of(array).filter(a -> a < 0).forEach(a -> a = replacement);

        for(int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                array[i] = replacement;
            }
        }
        return array;
    }
}
