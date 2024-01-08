package com.platform.movie.controller;

import com.platform.movie.domain.Movie;
import com.platform.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;


    @GetMapping("/getMoviesByCity/{cityName}")
    public ResponseEntity<List<Movie>> getMoviesListByCity(@PathVariable String cityName) {
        List<Movie> moviesByCity = movieService.getMoviesByCity(cityName);
        return ResponseEntity.ok(moviesByCity);
    }

    @GetMapping("/getMoviesByGenre/{genre}")
    public ResponseEntity<List<Movie>> getMoviesListByGener(@PathVariable String genre) {
        List<Movie> moviesByGenre = movieService.getMoviesByGenre(genre);
        return ResponseEntity.ok(moviesByGenre);
    }

    @GetMapping("/getMoviesByLanguage/{language}")
    public ResponseEntity<List<Movie>> getMoviesListByLanguage(@PathVariable String language) {
        List<Movie> moviesByLanguage = movieService.getMoviesByLanguage(language);
        return ResponseEntity.ok(moviesByLanguage);
    }


}
