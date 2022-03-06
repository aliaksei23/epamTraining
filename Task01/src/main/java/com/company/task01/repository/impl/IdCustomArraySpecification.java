package com.company.task01.repository.impl;

import com.company.task01.entity.CustomArray;
import com.company.task01.repository.CustomArraySpecification;

public class IdCustomArraySpecification implements CustomArraySpecification {

    private int id;

    public IdCustomArraySpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        boolean result = customArray.getCustomArrayId() == id;
        return result;
    }
}
