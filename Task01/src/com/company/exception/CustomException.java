package com.company.exception;

public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

    public static void arrayLengthCheck(int[] array) {
        if(array.length <= 0) {
            try {
                throw new CustomException("Array length < 0");
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
