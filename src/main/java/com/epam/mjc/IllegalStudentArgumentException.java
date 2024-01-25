package com.epam.mjc;

public class IllegalStudentArgumentException extends IllegalArgumentException {
    public IllegalStudentArgumentException(long id) {
        super("Could not find student with ID " + id);
    }
}
