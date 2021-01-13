package com.practice.movieinfoservice.repository;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.practice.movieinfoservice.entity.Movies;

@Repository
public class MoviesRepository extends AbstractDao implements IMoviesRepository {
	
	@Override
	public Movies getMovie(String movieId) {
		TypedQuery<Movies> query = getEm().createNamedQuery("Movies.getMovieById", Movies.class);
		query.setParameter("mId", Long.valueOf(movieId));
		Movies movie = query.getSingleResult();
		return movie;
	}

	@Override
	public long getMovieId(String title) {
		TypedQuery<Movies> query = getEm().createNamedQuery("Movies.getMovieByTitle", Movies.class);
		query.setParameter("mtitle", title);
		Movies movie = query.getSingleResult();
		return movie.getMovieId();
	}
	
}
