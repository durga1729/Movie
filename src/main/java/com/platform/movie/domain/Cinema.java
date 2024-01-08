package com.platform.movie.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Cinema {
    Movie movie;
    List<CinemaHall> cinemaHallList;
}
