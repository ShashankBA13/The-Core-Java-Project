package org.java.exceptions;

public class CustomException extends Exception {

    CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
