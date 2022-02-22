package com.company.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArray {

    static Logger logger = LogManager.getLogger();

    private int[] customArray;

    public CustomArray() {
    }

    public CustomArray(int[] customArray) {
        this.customArray = customArray;
    }

    public int[] getCustomArray() {
        return customArray.clone();
    }

    public void setCustomArray(int[] customArray) {
        this.customArray = customArray;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "customArray=" + Arrays.toString(customArray) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomArray that = (CustomArray) o;
        return Arrays.equals(customArray, that.customArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(customArray);
    }
}
