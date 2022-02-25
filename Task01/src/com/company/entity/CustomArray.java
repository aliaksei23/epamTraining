package com.company.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray {

    private static final Logger logger = LogManager.getLogger(CustomArray.class);

    private int[] customArray;

    public CustomArray() {
    }

    public CustomArray(int[] customArray) {
        logger.trace("create CustomArray");
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
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("customArray=" + Arrays.toString(customArray))
                .toString();
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
