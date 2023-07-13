package com.theinternetapp.utils.constants.endpoint;

public enum EndPoint {
    LOGIN("/login"),
    STATUS("/status_codes");



    public final String url;

    EndPoint(String url) {
        this.url = url;
    }
}
