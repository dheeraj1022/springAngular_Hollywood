package com.movies.angular.Services;

import java.util.List;

import com.movies.angular.Model.Movies;

public interface MoviesServices {
	

	public List<Movies> getMovies();
	public Movies getMovieByCode(String code);
	public void insertMovies(Movies movie);
	public void deleteMovies(String code);
	

}
