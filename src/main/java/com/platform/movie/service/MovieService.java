package com.platform.movie.service;

import com.platform.movie.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    List<Movie> moviesList;
      MovieService() {
          moviesList = new ArrayList<>();
      }
    public List<Movie> getMoviesByCity(String cityName) {
        moviesList = moviesList.stream()
                .filter(movie -> movie.getCities().stream()
                        .anyMatch(city -> city.getName().equalsIgnoreCase(cityName))).collect(Collectors.toList());
        return moviesList;
    }

    public List<Movie> getMoviesByGenre(String genre) {
        moviesList = moviesList.stream().filter(m -> m.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
        return moviesList;
    }

    public List<Movie> getMoviesByLanguage(String language) {
        moviesList = moviesList.stream().filter(m -> m.getLanguage().equalsIgnoreCase(language)).collect(Collectors.toList());
        return moviesList;
    }
}
