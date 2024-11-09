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

    public AddressEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public AddressEntity setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getResidency() {
        return residency;
    }

    public AddressEntity setResidency(String residency) {
        this.residency = residency;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public AddressEntity setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getCity() {
        return city;
    }

    public AddressEntity setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public AddressEntity setState(String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AddressEntity setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPincode() {
        return pincode;
    }

    public AddressEntity setPincode(String pincode) {
        this.pincode = pincode;
        return this;
    }
}
