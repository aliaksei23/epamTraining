package com.company.observer.impl;

import com.company.entity.CustomArray;
import com.company.entity.CustomArrayParameters;
import com.company.entity.Warehouse;
import com.company.observer.CustomArrayEvent;
import com.company.observer.CustomArrayObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class CustomArrayObserverImpl implements CustomArrayObserver {
    private static final Logger logger = LogManager.getLogger(CustomArrayObserverImpl.class);

    @Override
    public void sumChanged(CustomArrayEvent customArrayEvent) {
        CustomArrayParameters parameters = extracted(customArrayEvent);
        parameters.setSum(Arrays.stream(customArrayEvent.getSource().getCustomArray()).sum());
    }

    @Override
    public void averageChanged(CustomArrayEvent customArrayEvent) {
        CustomArrayParameters parameters = extracted(customArrayEvent);
        parameters.setAverage(Arrays.stream(customArrayEvent.getSource().getCustomArray()).average().getAsDouble());
    }

    @Override
    public void maxChanged(CustomArrayEvent customArrayEvent) {
        CustomArrayParameters parameters = extracted(customArrayEvent);
        parameters.setMax(Arrays.stream(customArrayEvent.getSource().getCustomArray()).max().orElse(0));
    }

    @Override
    public void minChanged(CustomArrayEvent customArrayEvent) {
        CustomArrayParameters parameters = extracted(customArrayEvent);
        parameters.setMin(Arrays.stream(customArrayEvent.getSource().getCustomArray()).min().orElse(0));
    }

    private CustomArrayParameters extracted(CustomArrayEvent customArrayEvent) {
        CustomArray customArray = customArrayEvent.getSource();
        int id = customArray.getId();
        Warehouse warehouse = Warehouse.getWarehouse();
        CustomArrayParameters parameters = warehouse.getParametersMap().get(id);
        return parameters;
    }


}
