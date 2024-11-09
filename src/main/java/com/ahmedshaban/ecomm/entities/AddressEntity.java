package com.ahmedshaban.ecomm.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class AddressEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "number")
    @Basic
    private String number;

    @Column(name = "residency")
    @Basic
    private String residency;

    @Column(name = "street")
    @Basic
    private String street;

    @Column(name = "city")
    @Basic
    private String city;

    @Column(name = "state")
    @Basic
    private String state;

    @Column(name = "country")
    @Basic
    private String country;

    @Column(name = "pincode")
    @Basic
    private String pincode;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getResidency() {
        return residency;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
