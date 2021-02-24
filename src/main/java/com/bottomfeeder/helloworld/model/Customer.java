package com.bottomfeeder.helloworld.model;

import java.math.BigDecimal;

public class Customer {
    private Integer customerNumber;
    private String customerName;
    private String lastModifiedDate;
    private Integer version;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String country;
    private String postCode;
    private String state;
    private String contactFirstName;
    private String contactLastName;
    private BigDecimal creditLimit;
    private String phone;


    public Customer() {

    }

    Customer(Integer customerNumber, String customerName, String lastModifiedDate, Integer version, String addressLine1, String addressLine2, String city, String country, String postCode, String state, String contactFirstName, String contactLastName, BigDecimal creditLimit, String phone) {
        this.customerNumber = customerNumber == null ? -1111 : customerNumber;
        this.customerName = customerName == null ? "name not supplied" : customerName;
        this.lastModifiedDate = lastModifiedDate;
        this.version = version;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.country = country;
        this.postCode = postCode;
        this.state = state;
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.creditLimit = creditLimit;
        this.phone = phone;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public Integer getVersion() {
        return version;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getState() {
        return state;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public String getPhone() {
        return phone;
    }
}
