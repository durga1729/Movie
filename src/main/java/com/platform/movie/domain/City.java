package com.platform.movie.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class City {
    String cityName;
    List<Cinema> cinemasList;
}
