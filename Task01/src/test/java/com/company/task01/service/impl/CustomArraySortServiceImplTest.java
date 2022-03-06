package com.company.task01.service.impl;

import com.company.task01.entity.CustomArray;
import com.company.task01.service.CustomArraySortService;
import com.company.task01.service.impl.CustomArraySortServiceImpl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArraySortServiceImplTest {

    private CustomArray customArray;
    private CustomArraySortService customArrayFindService;

    @BeforeClass
    public void createParameters() {
        customArray = new CustomArray(new int[]{-5, 2, 4, -10, 18});
        customArrayFindService = new CustomArraySortServiceImpl();
    }

    @Test
    public void testBubbleSort() {
        int[] sorted = customArrayFindService.bubbleSort(customArray);
        int[] expect = new int[]{-10, -5, 2, 4, 18};
        assertEquals(expect, sorted);
    }

    @Test
    public void testSelectionSort() {
        int[] sorted = customArrayFindService.selectionSort(customArray);
        int[] expect = new int[]{-10, -5, 2, 4, 18};
        assertEquals(expect, sorted);
    }

    @Test
    public void testInsertionSort() {
        int[] sorted = customArrayFindService.insertionSort(customArray);
        int[] expect = new int[]{-10, -5, 2, 4, 18};
        assertEquals(expect, sorted);
    }
}