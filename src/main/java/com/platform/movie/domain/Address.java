package com.platform.movie.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    String streetName;
    int zipcode;
    String city;
    String state;
    String country;
}
