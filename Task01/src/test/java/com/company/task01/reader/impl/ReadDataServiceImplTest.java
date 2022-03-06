package com.company.task01.reader.impl;

import com.company.task01.exception.CustomException;
import com.company.task01.reader.ReadDataService;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ReadDataServiceImplTest {
    File file = new File("E:\\alex\\epamTraining\\Task01\\src\\test\\resources\\text.txt");

    @Test
    public void testReadFileTillFirstValidLine() throws CustomException {
        ReadDataService readDataService = new ReadDataServiceImpl();
        String actual = readDataService.readFileTillFirstValidLine(file);
        String expected = "9, 8, 7, 6";
        assertEquals(expected, actual);
    }

    @Test
    public void testReadAllValidLinesFromFile() throws CustomException {
        ReadDataService readDataService = new ReadDataServiceImpl();
        List<String> expected = readDataService.readAllValidLinesFromFile(file);
        List<String> actual = new ArrayList<>();
        actual.add("9, 8, 7, 6");
        actual.add("-1 2 -3 4 111");
        assertEquals(expected, actual);
    }

    @Test(expectedExceptions = CustomException.class)
    public void readStringsFromEmptyFileTest() {
        ReadDataService readDataService = new ReadDataServiceImpl();
        File file = new File("non-existent-file.txt");
        try {
            readDataService.readFileTillFirstValidLine(file);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

}