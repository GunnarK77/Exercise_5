package com.company.schmidt;

public class person {
    private String name;
    private String email;

    public person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " Hello " + name +" at " + email + ". Now that you have entered your name in our database you may retreve any other peoples contact that are in our system";
    }
}
