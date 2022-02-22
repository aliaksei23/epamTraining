package com.company.service.impl;

import com.company.service.ParserToIntArrayService;

public class ParserToIntArrayServiceImpl implements ParserToIntArrayService {

    public int[] parseStringToIntArray(String string) {
        String[] splitString = string.split("\\s");
        int[] integer = new int[splitString.length];

        for(int i = 0; i < splitString.length; i++) {
            integer[i] = Integer.valueOf(splitString[i]);
        }
        return integer;
    }
}
