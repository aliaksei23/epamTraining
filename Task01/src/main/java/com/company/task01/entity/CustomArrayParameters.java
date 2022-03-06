package com.company.task01.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.StringJoiner;

public class CustomArrayParameters {

    private static final Logger logger = LogManager.getLogger(CustomArrayParameters.class);

    private int min;
    private int max;
    private int sum;
    private double average;

    public CustomArrayParameters() {
    }

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

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArrayParameters.class.getSimpleName() + "[", "]")
                .add("min=" + min)
                .add("max=" + max)
                .add("sum=" + sum)
                .add("average=" + average)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArrayParameters that = (CustomArrayParameters) o;

        if (min != that.min) return false;
        if (max != that.max) return false;
        if (sum != that.sum) return false;
        return Double.compare(that.average, average) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = min;
        result = 31 * result + max;
        result = 31 * result + sum;
        temp = Double.doubleToLongBits(average);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
