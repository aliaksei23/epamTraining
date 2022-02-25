package com.company.reader.impl;

import com.company.reader.ReadDataService;
import com.company.validator.ValidatorService;
import com.company.validator.impl.ValidatorServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadDataServiceImpl implements ReadDataService {
    private static final Logger logger = LogManager.getLogger(ReadDataServiceImpl.class);
    private ValidatorService<String> validator = new ValidatorServiceImpl();

    @Override
    public String readFile(File file) {
        String str = "no valid string";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while((str = bufferedReader.readLine()) != null) {
                if(validator.isValid(str)) {
                    return str;
                }
            }
        } catch(IOException e) {
            logger.error("Reader throw exception",e);
            e.printStackTrace();
        }
        return str;
    }
}
