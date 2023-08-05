package com.movieapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movieapp.entities.Theatre;
@Repository
public interface TheatreRepo extends JpaRepository<Theatre, Integer>{
	@Query("SELECT t FROM Theatre t JOIN t.movies m WHERE m.id = :movieId")
	List<Theatre> findTheatresByMovieI(@Param("movieId") Integer movieId);
	@Query("SELECT t FROM Theatre t JOIN FETCH t.movies")
	List<Theatre> findAllTheatresWithMovies();

}
