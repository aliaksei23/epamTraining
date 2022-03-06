package com.company.task01.parser.impl;

import com.company.task01.parser.ParserToIntArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParserToIntArrayServiceImpl implements ParserToIntArrayService {

    private static final Logger logger = LogManager.getLogger();
    //    private static final String SEPARATOR = "(,?\\s+)|(\\s+)|(,)|(_)";
//    private static final String SEPARATOR = "([-?\\d+,*;_\\s]+)";
    private static final String SEPARATOR ="(,\\s+)|(\\s+)|(;\\s+)";

    @Override
    public int[] parseStringToIntArray(String string) {
        String[] splitString = string.split(SEPARATOR);

        int[] ints = Arrays.stream(splitString)
                .mapToInt(Integer::parseInt)
                .toArray();
        logger.debug("String" + string + " parsed");
        return ints;
    }

    @Override
    public List<int[]> parseStringListToListIntArray(List<String> stringList) {
        List<int[]> integerList = new ArrayList<>();
        for (String s : stringList) {
            int[] ints = parseStringToIntArray(s);
            integerList.add(ints);
        }
        return integerList;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1, 2, 3, 4, 6");

        ParserToIntArrayService parser = new ParserToIntArrayServiceImpl();
        List<int[]> list = parser.parseStringListToListIntArray(stringList);
        System.out.println(Arrays.toString(list.get(0)));

        String s = "4; -5; -3; 14; 4";
        int[] ints = parser.parseStringToIntArray(s);
        System.out.println(Arrays.toString(ints));
    }
}
