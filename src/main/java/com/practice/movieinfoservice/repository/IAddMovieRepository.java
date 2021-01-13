package com.practice.movieinfoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.movieinfoservice.entity.Movies;

@Repository
public interface IAddMovieRepository extends JpaRepository<Movies, Long> {

}
