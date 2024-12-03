package com.gizasystems.hibernate.Exception;

public class InstructorNotFoundException extends RuntimeException{
    public InstructorNotFoundException() {
    }

    public InstructorNotFoundException(String message) {
        super(message);
    }

    public InstructorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
