package com.company.validator;

public interface ValidatorService<T> {

    boolean isValid(T obj);
}
