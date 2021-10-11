package com.example.studentInfoDemo.exception;

public class ExceptionMessage {
    private String message;
    private int code;
    private String description;

    public ExceptionMessage() {
    }

    public ExceptionMessage(String message, int code, String description) {
        this.message = message;
        this.code = code;
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
