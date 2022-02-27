package com.company.repository;

import com.company.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

public class Repository {

    private static final Logger logger = LogManager.getLogger(Repository.class);

    private static Repository repository;
    private static List<CustomArray> customArrayList;

    private Repository() {
    }

    public static Repository getRepository() {
        if (repository == null) {
            repository = new Repository();
            customArrayList = new ArrayList<>();
        }
        return repository;
    }

    public int size() {
        return customArrayList.size();
    }

    public boolean contains(CustomArray customArray) {
        return customArrayList.contains(customArray);
    }

    public boolean add(CustomArray customArray) {
        return customArrayList.add(customArray);
    }

    public boolean addAll(Collection<? extends CustomArray> c) {
        return customArrayList.addAll(c);
    }

    public boolean remove(CustomArray customArray) {
        return customArrayList.remove(customArray);
    }

    public boolean removeAll(Collection<?> c) {
        return customArrayList.removeAll(c);
    }

    public CustomArray get(int id) {
        return customArrayList.get(id);
    }

    public CustomArray set(int id, CustomArray element) {
        return customArrayList.set(id, element);
    }

    public List<CustomArray> query(Specification specification) {
        List<CustomArray> listResult = new ArrayList<>();
        CustomArray customArray = new CustomArray();
        for (CustomArray c : customArrayList) {
            if (specification.specify(c)) {
                listResult.add(c);
            }
        }
        return listResult;
    }

    public List<CustomArray> queryStream(Specification specification) {
        List<CustomArray> listResult = customArrayList.stream()
                .filter(c -> specification.specify(c))
                .collect(Collectors.toList());
        return listResult;
    }

    public List<CustomArray> sortId() {
        customArrayList.sort(Comparator.comparingInt(CustomArray::getId));
        return customArrayList;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Repository.class.getSimpleName() + "[", "]")
                .toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
