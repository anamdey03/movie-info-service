package com.practice.movieinfoservice.repository;

import com.practice.movieinfoservice.entity.Movies;

public interface IMoviesRepository {

	Movies getMovie(String movieId);
	long getMovieId(String title);

}