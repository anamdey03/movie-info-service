package com.practice.movieinfoservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.movieinfoservice.entity.Movies;
import com.practice.movieinfoservice.service.IMoviesService;

@RestController
@RequestMapping("/movies")
public class MoviesController {

	@Autowired
	private IMoviesService moviesService;

	@RequestMapping(value = "/{movieId}", method = RequestMethod.GET)
	public Movies getMovieInfo(@PathVariable("movieId") String movieId) {
		return moviesService.getMovie(movieId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String addNewMovie(@RequestBody Movies movie) {
		List<Movies> movies = moviesService.getAllMovies();
		List<String> titles = new ArrayList<String>();
		for (Movies m : movies) {
			titles.add(m.getTitle());
		}
		if (!titles.contains(movie.getTitle())) {
			moviesService.addMovie(movie);
			long id = moviesService.getMovieId(movie.getTitle());
			return String.valueOf(id);
		}
		else {
			long id = moviesService.getMovieId(movie.getTitle());
			return String.valueOf(id);
		}
	}
	
	@RequestMapping(value = "/title/{movieName}", method = RequestMethod.GET)
	public String getMovieInfoByMovieName(@PathVariable("movieName") String movieName) {
		long id = moviesService.getMovieId(movieName);
		return String.valueOf(id);
	}
}
