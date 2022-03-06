package com.company.task01.observer;

import com.company.task01.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.EventObject;

public class CustomArrayEvent extends EventObject {

    private static final Logger logger = LogManager.getLogger(CustomArrayEvent.class);

    public CustomArrayEvent(Object source) {
        super(source);
    }

    @Override
    public CustomArray getSource() {
        return (CustomArray) super.getSource();
    }
}
