package com.company.task01.reader.impl;

import com.company.task01.exception.CustomException;
import com.company.task01.reader.ReadDataService;
import com.company.task01.validator.ValidatorService;
import com.company.task01.validator.impl.ValidatorServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadDataServiceImpl implements ReadDataService {
    private static final Logger logger = LogManager.getLogger(ReadDataServiceImpl.class);

    private ValidatorService<String> stringValidator = new ValidatorServiceImpl();

    @Override
    public String readFileTillFirstValidLine(File file) throws CustomException {
        String currentStr;
        String validString = "";
        checkFile(file);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((currentStr = bufferedReader.readLine()) != null) {
                if (stringValidator.isStringValid(currentStr)) {
                    validString = currentStr;
                    break;
                }
            }
        } catch (IOException e) {
            logger.error("Reader throw exception", e);
            throw new CustomException(e);
        }
        return validString;
    }

    @Override
    public List<String> readAllValidLinesFromFile(File file) throws CustomException {
        List<String> allValidLines = new ArrayList<>();
        checkFile(file);
        String currentStr;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((currentStr = bufferedReader.readLine()) != null) {
                if (stringValidator.isStringValid(currentStr)) {
                    allValidLines.add(currentStr);
                }
            }
        } catch (IOException e) {
            logger.error("Reader throw exception", e);
            throw new CustomException(e);
        }
        return allValidLines;
    }

    private void checkFile(File file) {
        if (!file.exists()) {
            try {
                logger.error("File don't exists");
                throw new CustomException();
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }

    }
}
