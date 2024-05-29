package com.in28minutes.rest.webservices.versioning;

public class Name {
    private String firstName;
    private String lastName;
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



}
