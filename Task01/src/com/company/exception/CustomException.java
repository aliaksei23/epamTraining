package com.company.exception;

public class CustomException extends Exception {

    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
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
