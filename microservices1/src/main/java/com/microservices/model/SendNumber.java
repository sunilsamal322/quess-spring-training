package com.microservices.model;

public class SendNumber {

    private Integer number1;
    private Integer number2;

    private String environment;
    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public Integer getNumber2() {
        return number2;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
