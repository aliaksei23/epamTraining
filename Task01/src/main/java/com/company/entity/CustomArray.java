package com.company.entity;

import com.company.observer.CustomArrayEvent;
import com.company.observer.CustomArrayObservable;
import com.company.observer.CustomArrayObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray implements CustomArrayObservable {

    private static final Logger logger = LogManager.getLogger(CustomArray.class);

    private int[] customArray;
    private static int id;
    private CustomArrayObserver customArrayObserver;

    public CustomArray() {
    }

    public CustomArray(int[] customArray) {
//        logger.trace("create CustomArray");
        this.customArray = customArray;
        id++;
    }

    public int[] getCustomArray() {
        return customArray.clone();
    }

    public int getId() {
        return id;
    }

    public void setCustomArray(int[] customArray) {
        this.customArray = customArray;
        notifyObservers();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("customArray=" + Arrays.toString(customArray))
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomArray that = (CustomArray) o;
        return Arrays.equals(customArray, that.customArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(customArray);
    }

    @Override
    public void notifyObservers() {
        CustomArrayEvent customArrayEvent = new CustomArrayEvent(this);
        customArrayObserver.sumChanged(customArrayEvent);
        customArrayObserver.averageChanged(customArrayEvent);
        customArrayObserver.maxChanged(customArrayEvent);
        customArrayObserver.minChanged(customArrayEvent);
    }
}
