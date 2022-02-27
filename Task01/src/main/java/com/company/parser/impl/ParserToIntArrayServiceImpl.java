package com.company.parser.impl;

import com.company.parser.ParserToIntArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ParserToIntArrayServiceImpl implements ParserToIntArrayService {

    private static final Logger logger = LogManager.getLogger(ParserToIntArrayServiceImpl.class);
    private static final String SEPARATOR = "\\s";
//[-?\s+[^0-9]]
    public int[] parseStringToIntArray(String string) {
        String[] splitString = string.split(SEPARATOR);
        int[] integer = new int[splitString.length];

        for(int i = 0; i < splitString.length; i++) {
            integer[i] = Integer.parseInt(splitString[i]);
        }
        return integer;
    }
}
