package com.thoughtworks.capability.gtb.demospringconfig;

public class Credentials {
    private String username;
    private String password;
    private String authMethod;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAuthMethod() {
        return authMethod;
    }

    @Override
    public String toString() {
        return " {username=" + username +
                ", password=" + password +
                ", authMethod=" + authMethod
                +"}";
    }
}
