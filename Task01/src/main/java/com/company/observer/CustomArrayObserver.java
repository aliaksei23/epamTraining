package com.company.observer;

import com.company.entity.CustomArray;

public interface CustomArrayObserver {

    void sumChanged(CustomArrayEvent customArrayEvent);

    void averageChanged(CustomArrayEvent customArrayEvent);

    void maxChanged(CustomArrayEvent customArrayEvent);

    void minChanged(CustomArrayEvent customArrayEvent);
}
