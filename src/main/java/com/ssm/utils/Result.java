package com.ssm.utils;

import java.io.Serializable;

public class Result<T> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private boolean success;
    private String message;
    private String statusCode;
    private T data;

    public static <T> Result<T> success() {
        Result<T> result = new Result<T>();
        result.setSuccess(true);
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<T>();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fail() {
        Result<T> result = new Result<T>();
        result.setSuccess(false);
        return result;
    }

    public static <T> Result<T> fail(String message) {
        Result<T> result = new Result<T>();
        result.setSuccess(false);
        result.setMessage(message);
        return result;
    }

    public static <T> Result<T> fail(String message, String statusCode) {
        Result<T> result = new Result<T>();
        result.setSuccess(false);
        result.setMessage(message);
        result.setStatusCode(statusCode);
        return result;
    }

    public static <T> Result<T> fail(String message, T data) {
        Result<T> result = new Result<T>();
        result.setSuccess(false);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
