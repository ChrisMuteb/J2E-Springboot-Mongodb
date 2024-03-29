package com.example.mongospringtut.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "address")
public class Address {
//    @Id
//    private String addID;
    private String address1;
    private String address2;
    private String city;

//    public String getAddID() {
//        return addID;
//    }
//
//    public void setAddID(String addID) {
//        this.addID = addID;
//    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address( String address1, String address2, String city) {
//        this.addID = addID;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
    }

    public Address() {
    }
}
