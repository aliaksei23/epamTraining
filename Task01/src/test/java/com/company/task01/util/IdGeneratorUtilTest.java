package com.company.task01.util;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdGeneratorUtilTest {

    @Test
    public void testGenerate() {

        int id = IdGeneratorUtil.generate();
        int actual = IdGeneratorUtil.generate();
        assertEquals(1,actual);
    }
}