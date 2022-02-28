package com.company.repository.impl;

import com.company.entity.CustomArray;
import com.company.repository.Specification;

public class IdSpecification implements Specification {

    private int id;

    public IdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        boolean result = customArray.getId() == id;
        return result;
    }
}
