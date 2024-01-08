package com.platform.movie.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class CinemaHall {
    String name;
    int noOfSeats;
    CinemaHallSeat cinemaHallSeat;
    List<Show> show;
}
