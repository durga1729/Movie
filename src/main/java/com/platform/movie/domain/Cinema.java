package com.platform.movie.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Cinema {
    String name;
    List<CinemaHall> cinemaHallList;
}
