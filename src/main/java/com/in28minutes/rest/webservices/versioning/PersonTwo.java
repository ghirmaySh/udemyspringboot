package com.in28minutes.rest.webservices.versioning;

public class PersonTwo {
   private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonTwo{" +
                "name=" + name +
                '}';
    }

    public PersonTwo(Name name) {
        this.name = name;
    }
}
