package com.company.service.impl;

import com.company.entity.CustomArray;
import com.company.exception.CustomException;
import com.company.service.CustomArrayReplaceArgService;

import java.util.stream.IntStream;

public class CustomArrayReplaceArgServiceImpl implements CustomArrayReplaceArgService {

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
