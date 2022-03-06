package com.company.task01.parser;

import java.util.List;

public interface ParserToIntArrayService {

    int[] parseStringToIntArray(String string);

    List<int[]> parseStringListToListIntArray(List<String> stringList);

}
