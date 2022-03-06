package com.company.task01.entity;

import com.company.task01.observer.CustomArrayObserver;
import com.company.task01.observer.impl.CustomArrayObservableImpl;
import com.company.task01.observer.impl.CustomArrayObserverImpl;
import com.company.task01.repository.Repository;
import com.company.task01.util.IdGeneratorUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray extends CustomArrayObservableImpl {
    private static final Logger logger = LogManager.getLogger(CustomArray.class);
    private CustomArrayObserver customArrayObserver = new CustomArrayObserverImpl();

    private int customArrayId;
    private int[] customArray;

    public CustomArray() {
        customArray = new int[0];
        customArrayId = IdGeneratorUtil.generate();
        Repository.getRepository().add(this);
        Warehouse.getWarehouse().put(customArrayId, new CustomArrayParameters());
    }

    public CustomArray(int[] customArray) {
        customArrayId = IdGeneratorUtil.generate();
        this.customArray = customArray;
        Repository.getRepository().add(this);
        Warehouse.getWarehouse().put(customArrayId, new CustomArrayParameters());
        attach(customArrayObserver);
        notifyObservers();
    }

    public int[] getCustomArray() {
        return customArray.clone();
    }

    public int getCustomArrayId() {
        return customArrayId;
    }

    public void setCustomArray(int[] customArray) {
        this.customArray = customArray;
        notifyObservers();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("CustomArrayId=" + customArrayId)
                .add("customArray=" + Arrays.toString(customArray))
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomArray)) return false;

        CustomArray that = (CustomArray) o;

        if (getCustomArrayId() != that.getCustomArrayId()) return false;
        return Arrays.equals(getCustomArray(), that.getCustomArray());
    }

    @Override
    public int hashCode() {
        int result = getCustomArrayId();
        result = 31 * result + Arrays.hashCode(getCustomArray());
        return result;
    }
}
