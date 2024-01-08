package com.platform.movie.service;

import com.platform.movie.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    public List<Movie> getMoviesByCity(String cityName) {
        return new ArrayList<>();
    }

    public List<Movie> getMoviesByGenre(String genre) {
        return new ArrayList<>();
    }

    public List<Movie> getMoviesByLanguage(String language) {
        return new ArrayList<>();
    }
}
