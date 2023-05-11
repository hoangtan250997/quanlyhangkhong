package com.example.quanlychuyenbay.exception;

import org.springframework.http.HttpStatus;

public class DemoException {

    private static final String NHANVIEN_NOT_FOUND_MSG_KEY = "NhanVienNotExisted";
    private static final String NHANVIEN_NOT_FOUND_MSG = "Nhan Vien Not Found";
    private static final String CHUNGNHAN_NOT_FOUND_MSG_KEY = "ChungNhanNotExisted";
    private static final String CHUNGNHAN_NOT_FOUND_MSG = "Chung Nhan Not Found";
    private static final String MAYBAY_NOT_FOUND_MSG_KEY = "MayBayNotExisted";
    private static final String MAYBAY_NOT_FOUND_MSG = "May Bay Not Found";
    public static ResponseException notFound(String messageKey, String message) {
        return new ResponseException(messageKey, message, HttpStatus.NOT_FOUND);
    }

    public static ResponseException badRequest(String messageKey, String message) {
        return new ResponseException(messageKey, message, HttpStatus.BAD_REQUEST);
    }

    public static ResponseException internalServerError(String messageKey, String message) {
        return new ResponseException(messageKey, message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static ResponseException NhanVienNotFound() {
        return notFound(NHANVIEN_NOT_FOUND_MSG_KEY, NHANVIEN_NOT_FOUND_MSG);
    }
    public static ResponseException ChungNhanNotFound() {
        return notFound(CHUNGNHAN_NOT_FOUND_MSG_KEY, CHUNGNHAN_NOT_FOUND_MSG);
    }

    public static ResponseException MaybayNotFound() {
        return notFound(MAYBAY_NOT_FOUND_MSG_KEY, MAYBAY_NOT_FOUND_MSG);
    }
}
