package com.company.task01.parser.impl;

import com.company.task01.parser.ParserToIntArrayService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class ParserToIntArrayServiceImplTest {
    ParserToIntArrayService parser = new ParserToIntArrayServiceImpl();

    @DataProvider(name = "parse_data")
    public Object[][] createParseData() {
        Object[][] data = new Object[5][1];
        data[0] = new Object[]{"4; -5; -3; 14; 4", new int[]{4, -5, -3, 14, 4}};
        data[1] = new Object[]{"   14 ; -  100   ; 0    ", new int[]{14, -100, 0}};
        data[2] = new Object[]{"- 78", new int[]{-78}};
        data[3] = new Object[]{"44", new int[]{44}};
        data[4] = new Object[]{"      ", new int[0]};
        return data;
    }

    public List<String> createLinesList() {
        List<String> lines = new ArrayList<>();
        lines.add("4; -5; -3; 14; 4");
        lines.add("   14 ; -  100   ; 0    ");
        lines.add("- 78");
        lines.add("44");
        lines.add("      ");
        return lines;
    }

    public List<int[]> createArraysList() {
        List<int[]> arrays = new ArrayList<>();
        arrays.add(new int[]{4, -5, -3, 14, 4});
        arrays.add(new int[]{14, -100, 0});
        arrays.add(new int[]{-78});
        arrays.add(new int[]{44});
        arrays.add(new int[0]);
        return arrays;
    }


    @Test(dataProvider = "parse_data")
    public void testParseStringToIntArray(String line, int[] expected) {
        int[] actual = parser.parseStringToIntArray(line);
        assertEquals(expected, actual);
    }

    @Test
    public void testParseStringListToListIntArray() {
        List<String> actual = createLinesList();
        List<int[]> expected = createArraysList();
        assertEquals(expected, actual);
    }
}
