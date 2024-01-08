package com.platform.movie.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
public class Movie {
    String movieTitle;
    String description;
    int durationInMins;
    String language;
    String genre;
    Date releaseDate;
    Cast cast;
    Crew crew;
    Votes votes;
   List<City> cities;
}
