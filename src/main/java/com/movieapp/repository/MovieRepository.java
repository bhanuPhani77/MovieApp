package com.movieapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movieapp.entities.Movie;
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{
	@Query("SELECT m FROM Movie m JOIN m.theatres t WHERE t.id = :theatreId")
	List<Movie> findMoviesWithTheatreId(@Param("theatreId") Integer theatreId);
	@Query("SELECT m FROM Movie m JOIN FETCH m.theatres")
	List<Movie> findAllMoviesWithTheatres();

}
