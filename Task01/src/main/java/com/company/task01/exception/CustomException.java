package com.company.task01.exception;

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

}
