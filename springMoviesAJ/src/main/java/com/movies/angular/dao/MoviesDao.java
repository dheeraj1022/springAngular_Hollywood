package com.movies.angular.dao;

import java.util.List;

import com.movies.angular.Model.Movies;


public interface MoviesDao {
	
	public List<Movies> getMovies();
	public Movies getMovieByCode(String code);
	public void insertMovies(Movies movie);
	public void deleteMovies(String code);
	

}
