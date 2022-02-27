package com.company.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayParameters {

    private static final Logger logger = LogManager.getLogger(CustomArrayParameters.class);

    private int min;
    private int max;
    private int sum;
    private double average;

    public CustomArrayParameters(int min, int max, int sum, double average) {
        this.min = min;
        this.max = max;
        this.sum = sum;
        this.average = average;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getSum() {
        return sum;
    }

    public double getAverage() {
        return average;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
