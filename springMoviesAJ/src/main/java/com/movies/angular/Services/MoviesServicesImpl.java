package com.movies.angular.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.angular.Model.Movies;
import com.movies.angular.dao.MoviesDao;
import com.movies.angular.dao.MoviesDaoImpl;



@Service("moviesServices")
@Transactional
public class MoviesServicesImpl implements MoviesServices {
	
	@Autowired
	private MoviesDao moviesDao;

	public List<Movies> getMovies() {
		List<Movies>movieList=moviesDao.getMovies();
		return movieList;
	}

	public Movies getMovieByCode(String code) {
		Movies movie = moviesDao.getMovieByCode(code);
		return movie;
	}

	public void insertMovies(Movies movie) {
		moviesDao.insertMovies(movie);
		
	}

	public void deleteMovies(String code) {
		moviesDao.deleteMovies(code);
	}

	
		
}