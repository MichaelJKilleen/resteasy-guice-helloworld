package com.bottomfeeder.helloworld.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class CustomerBuilder {

    private static final Logger logger = LoggerFactory.getLogger(CustomerBuilder.class);

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

    public CustomerBuilder setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public CustomerBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public CustomerBuilder setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    public CustomerBuilder setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public CustomerBuilder setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public CustomerBuilder setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public CustomerBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public CustomerBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public CustomerBuilder setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    public CustomerBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public CustomerBuilder setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
        return this;
    }

    public CustomerBuilder setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
        return this;
    }

    public CustomerBuilder setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }

    public CustomerBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Customer createCustomer() {
        this.customerNumber = getValueOrDefault(customerNumber,-1111);
        this.customerName = getValueOrDefault(customerName,"name not supplied");
        this.lastModifiedDate = lastModifiedDate;
        this.version = getValueOrDefault(version, -1);
        this.addressLine1 = getValueOrDefault(addressLine1,"");
        this.addressLine2 = getValueOrDefault(addressLine2,"");
        this.city = getValueOrDefault(city,"");
        this.country = getValueOrDefault(country,"");
        this.postCode = getValueOrDefault(postCode,"");
        this.state = getValueOrDefault(state,"");
        this.contactFirstName = getValueOrDefault(contactFirstName,"");
        this.contactLastName = getValueOrDefault(contactLastName, "");
        this.creditLimit = getValueOrDefault(creditLimit, BigDecimal.ZERO);
        this.phone = getValueOrDefault(phone, "");
        return new Customer(customerNumber, customerName, lastModifiedDate, version, addressLine1, addressLine2, city, country, postCode, state, contactFirstName, contactLastName, creditLimit, phone);
    }


    public static <T> T getValueOrDefault(T value, T defaultValue) {
        return value == null ? defaultValue : value;
    }


    @Override
    public String toString() {
        return "{\"CustomerBuilder\":{"
                + "\"customerNumber\":\"" + customerNumber + "\""
                + ", \"customerName\":\"" + customerName + "\""
                + ", \"lastModifiedDate\":\"" + lastModifiedDate + "\""
                + ", \"version\":\"" + version + "\""
                + ", \"addressLine1\":\"" + addressLine1 + "\""
                + ", \"addressLine2\":\"" + addressLine2 + "\""
                + ", \"city\":\"" + city + "\""
                + ", \"country\":\"" + country + "\""
                + ", \"postCode\":\"" + postCode + "\""
                + ", \"state\":\"" + state + "\""
                + ", \"contactFirstName\":\"" + contactFirstName + "\""
                + ", \"contactLastName\":\"" + contactLastName + "\""
                + ", \"creditLimit\":\"" + creditLimit + "\""
                + ", \"phone\":\"" + phone + "\""
                + "}}";
    }
}