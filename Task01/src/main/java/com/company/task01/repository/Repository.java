package com.company.task01.repository;

import com.company.task01.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

public class Repository {

    private static final Logger logger = LogManager.getLogger(Repository.class);

    private static Repository repository;
    private List<CustomArray> customArrayList;

    private Repository() {
        customArrayList = new ArrayList<>();
    }

    public static Repository getRepository() {
        if (repository == null) {
            repository = new Repository();
        }
        return repository;
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

    public List<CustomArray> query(CustomArraySpecification customArraySpecification) {
        List<CustomArray> listResult = new ArrayList<>();
        CustomArray customArray = new CustomArray();
        for (CustomArray c : customArrayList) {
            if (customArraySpecification.specify(c)) {
                listResult.add(c);
            }
        }
        return listResult;
    }

    public List<CustomArray> queryStream(CustomArraySpecification customArraySpecification) {
        List<CustomArray> listResult = customArrayList.stream()
                .filter(c -> customArraySpecification.specify(c))
                .collect(Collectors.toList());
        return listResult;
    }

    public List<CustomArray> sort(Comparator<? super CustomArray> comparator) {
        List<CustomArray> result = customArrayList.stream()
                .sorted(comparator)
                .toList();
        return result;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Repository.class.getSimpleName() + "[", "]")
                .add("customArrayList=" + customArrayList)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Repository)) return false;

        Repository that = (Repository) o;

        return customArrayList.equals(that.customArrayList);
    }

    @Override
    public int hashCode() {
        return customArrayList.hashCode();
    }
}
