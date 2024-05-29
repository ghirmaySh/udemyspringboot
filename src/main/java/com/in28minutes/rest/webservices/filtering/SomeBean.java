package com.in28minutes.rest.webservices.filtering;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class SomeBean {
    private String fieldOne;
    @JsonIgnore
    private String fieldTwo;
    private String fieldThree;

    public SomeBean(String fieldOne, String fieldTwo, String fieldThree) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
        this.fieldThree = fieldThree;
    }

    public String getFieldOne() {
        return fieldOne;
    }

    public void setFieldOne(String fieldOne) {
        this.fieldOne = fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public void setFieldTwo(String fieldTwo) {
        this.fieldTwo = fieldTwo;
    }

    public String getFieldThree() {
        return fieldThree;
    }

    public void setFieldThree(String fieldThree) {
        this.fieldThree = fieldThree;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "fieldOne='" + fieldOne + '\'' +
                ", fieldTwo='" + fieldTwo + '\'' +
                ", fieldThree='" + fieldThree + '\'' +
                '}';
    }
}
