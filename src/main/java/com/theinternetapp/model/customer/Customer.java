package com.theinternetapp.model.customer;

public enum Customer {

    user("tomsmith", "SuperSecretPassword!");

    final String username;
    final String password;


    Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public static Customer withName(String name) {
        return valueOf(name);
    }

}