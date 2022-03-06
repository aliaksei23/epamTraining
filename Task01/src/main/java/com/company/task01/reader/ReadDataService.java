package com.company.task01.reader;

import com.company.task01.exception.CustomException;

import java.io.File;
import java.util.List;

public interface ReadDataService {
    String readFileTillFirstValidLine(File file) throws CustomException;

    List<String> readAllValidLinesFromFile(File file) throws CustomException;
}
