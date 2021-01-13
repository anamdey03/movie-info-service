package com.practice.movieinfoservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Movies.getMovieById", query = "from Movies m where m.movieId =:mId"),
	@NamedQuery(name = "Movies.getMovieByTitle", query = "from Movies m where m.title =:mtitle")})
public class Movies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long movieId;
	private String title;
	private String description;

	public Movies() {
		
	}

	public Movies(long movieId, String title, String description) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.description = description;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
