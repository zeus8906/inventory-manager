package com.epam.mentoring.invman.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class for representing address information of warehouses, shops etc.
 * 
 * @author zeusz
 * 
 */
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "country")
    private String country;
    @Column(name = "postalcode")
    private String postalCode;
    @Column(name = "city")
    private String city;
    @Column(name = "addressline")
    private String addressLine;

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(final String addressLine) {
        this.addressLine = addressLine;
    }

}
