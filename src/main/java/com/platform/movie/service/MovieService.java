package com.platform.movie.service;

import com.platform.movie.domain.Cinema;
import com.platform.movie.domain.City;
import com.platform.movie.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    RestTemplate restTemplate;


    public List<Cinema> getMoviesByCity(String cityName) {
        List<City> cityList = getMoviesListByCity();
        return cityList.stream().filter(c->c.getCityName().equalsIgnoreCase(cityName)).map(City::getCinemasList).findAny().get();
    }

    public List<Cinema> getMoviesByGenre(String genre) {
        List<City> cityList = getMoviesListByCity();
      return cityList.stream().flatMap(l->l.getCinemasList().stream())
              .filter(a->a.getMovie().getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
    }

    public List<Cinema> getMoviesByLanguage(String language) {
        List<City> cityList = getMoviesListByCity();
        return cityList.stream().flatMap(l->l.getCinemasList().stream())
                .filter(a->a.getMovie().getLanguage().equalsIgnoreCase(language)).collect(Collectors.toList());
    }

    private List<City> getMoviesListByCity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange("http://localhost:8081/getCities", HttpMethod.GET, entity, List.class).getBody();
    }
}
