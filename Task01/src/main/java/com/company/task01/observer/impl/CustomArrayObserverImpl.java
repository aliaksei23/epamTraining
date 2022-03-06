package com.company.task01.observer.impl;

import com.company.task01.entity.CustomArray;
import com.company.task01.entity.CustomArrayParameters;
import com.company.task01.entity.Warehouse;
import com.company.task01.observer.CustomArrayEvent;
import com.company.task01.observer.CustomArrayObserver;
import com.company.task01.service.CustomArrayFindService;
import com.company.task01.service.impl.CustomArrayFindServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayObserverImpl implements CustomArrayObserver {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void parameterСhange(CustomArrayEvent customArrayEvent) {
        CustomArrayFindService findService = new CustomArrayFindServiceImpl();

        CustomArray customArray = customArrayEvent.getSource();
        int sum = findService.findSum(customArray);
        double average = findService.findAverage(customArray);
        int max = findService.findMax(customArray);
        int min = findService.findMin(customArray);

        int customArrayId = customArray.getCustomArrayId();
        CustomArrayParameters customArrayParameters = new CustomArrayParameters(min, max, sum, average);

        Warehouse warehouse = Warehouse.getWarehouse();
        warehouse.put(customArrayId, customArrayParameters);

        logger.trace("CustomArray id " + customArrayId + " parameters in Warehouse updated"
                + customArrayEvent + " " + customArrayParameters);
    }
}
