package com.company.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private static final Logger logger = LogManager.getLogger(Warehouse.class);

    private static Warehouse warehouse;
    private Map<Integer, CustomArrayParameters> parametersMap;

    private Warehouse() {
        parametersMap = new HashMap<>();
    }

    public static Warehouse getWarehouse() {
        if (warehouse == null) {
            warehouse = new Warehouse();

        }
        return warehouse;
    }

    public Map<Integer, CustomArrayParameters> getParametersMap() {
        return parametersMap;
    }
}
