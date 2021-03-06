package com.invitation;

import java.util.Objects;

public class Address {
    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public boolean isCountry(String nation) {
        return Objects.equals(this.country, nation);
    }
}
