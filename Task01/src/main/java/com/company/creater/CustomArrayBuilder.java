package com.company.creater;

import com.company.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayBuilder {

    private static final Logger logger = LogManager.getLogger(CustomArrayBuilder.class);

    private int[] array;

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
}
