package com.kafkaconsumer.model;

import java.io.Serializable;

public class Order implements Serializable {

    private String customer;
    private String value;

    public Order(String customer, String value) {
        this.customer = customer;
        this.value = value;
    }

    public Order() {
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer='" + customer + '\'' +
                ", value=" + value +
                '}';
    }
}
