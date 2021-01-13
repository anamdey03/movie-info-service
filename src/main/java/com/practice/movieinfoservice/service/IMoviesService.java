package com.practice.movieinfoservice.service;

import java.util.List;

import com.practice.movieinfoservice.entity.Movies;

public interface IMoviesService {

	Movies getMovie(String movieId);
	void addMovie(Movies movie);
	List<Movies> getAllMovies();
	long getMovieId(String title);
}