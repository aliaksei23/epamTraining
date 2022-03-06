package com.company.task01.creater;

import com.company.task01.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayBuilder {

    private static final Logger logger = LogManager.getLogger(CustomArrayBuilder.class);

    private int[] array;
    private List<int[]> list;

    public static CustomArrayBuilder builder() {
        return new CustomArrayBuilder();
    }

    public CustomArrayBuilder setArray(int[] array) {
        this.array = array;
        return this;
    }

    public CustomArray build() {
        return new CustomArray(array);
    }

    public CustomArrayBuilder setArray(List<int[]> list) {
        this.list = list;
        return this;
    }

    public List<CustomArray> buildCustomArrays() {
        List<CustomArray> customArrayList = new ArrayList<>();
        CustomArray customArray;
        for (int[] array : list) {
            customArray = setArray(array).build();
            customArrayList.add(customArray);
        }
        return customArrayList;
    }
}
