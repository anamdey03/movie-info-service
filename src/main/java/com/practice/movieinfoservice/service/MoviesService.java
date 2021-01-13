package com.practice.movieinfoservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.movieinfoservice.entity.Movies;
import com.practice.movieinfoservice.repository.IAddMovieRepository;
import com.practice.movieinfoservice.repository.IMoviesRepository;

@Service
public class MoviesService implements IMoviesService {

	@Autowired
	private IMoviesRepository moviesRepository;

	@Autowired
	private IAddMovieRepository addMovieRepository;

	@Override
	public Movies getMovie(String movieId) {
		return moviesRepository.getMovie(movieId);
	}

	@Override
	public List<Movies> getAllMovies() {
		return addMovieRepository.findAll();

	}

	@Override
	public void addMovie(Movies movie) {
		addMovieRepository.save(movie);
	}
	
	@Override
	public long getMovieId(String title) {
		return moviesRepository.getMovieId(title);
	}
}
