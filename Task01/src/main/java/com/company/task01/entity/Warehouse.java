package com.company.task01.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

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

    public CustomArrayParameters put(Integer id, CustomArrayParameters value) {
        return parametersMap.put(id, value);
    }

    public void putAll(Map<? extends Integer, ? extends CustomArrayParameters> m) {
        parametersMap.putAll(m);
    }

    public CustomArrayParameters get(Integer id) {
        return parametersMap.get(id);
    }

    public CustomArrayParameters remove(Integer id) {
        return parametersMap.remove(id);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Warehouse.class.getSimpleName() + "[", "]")
                .add("parametersMap=" + parametersMap)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warehouse)) return false;

        Warehouse warehouse = (Warehouse) o;

        return parametersMap.equals(warehouse.parametersMap);
    }

    @Override
    public int hashCode() {
        return parametersMap.hashCode();
    }
}
