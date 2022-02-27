package com.company.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomException extends Exception {

    private static final Logger logger = LogManager.getLogger(CustomException.class);

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
        if (array.length <= 0) {
            try {
                throw new CustomException("Array length < 0");
            } catch (Exception e) {
                logger.error("Array has length less than " + array.length);
                e.printStackTrace();
            }
        }
    }
}
