package com.company.service.impl;

import com.company.service.ReadDataService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadDataForCustomArray implements ReadDataService {

    private ValidatorImpl validator = new ValidatorImpl();

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
            e.printStackTrace();
        }
        return str;
    }
}
