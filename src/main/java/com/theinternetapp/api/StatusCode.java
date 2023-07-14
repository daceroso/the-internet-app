package com.theinternetapp.api;

public enum StatusCode {

    CODE_200(200);

    private final int code;

    StatusCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
