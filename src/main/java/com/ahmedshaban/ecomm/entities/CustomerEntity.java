package com.ahmedshaban.ecomm.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @NotNull(message = "Username is required.")
    @Basic(optional = false)
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    @Basic(optional = false)
    private String password;

    @Column(name = "first_name")
    @Basic(optional = false)
    private String firstName;

    @Column(name = "last_name")
    @Basic(optional = false)
    private String lastName;

    @Column(name = "email")
    @Basic(optional = false)
    private String email;

    @Column(name = "phone")
    @Basic(optional = false)
    private String phone;

    @Column(name = "user_status")
    @Basic(optional = false)
    private String userStatus;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "customer_address",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")
    )
    private List<AddressEntity> addresses = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public CustomerEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public CustomerEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CustomerEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CustomerEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CustomerEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public CustomerEntity setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public UUID getId() {
        return id;
    }

    public CustomerEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public List<AddressEntity> getAddresses() {
        return addresses;
    }

    public CustomerEntity setAddresses(List<AddressEntity> addresses) {
        this.addresses = addresses;
        return this;
    }
}
