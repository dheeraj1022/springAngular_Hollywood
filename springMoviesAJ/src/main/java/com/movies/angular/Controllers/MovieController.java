package com.movies.angular.Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.movies.angular.Model.Movies;
import com.movies.angular.Services.MoviesServices;


@RestController
public class MovieController {
	
	@Autowired
	private MoviesServices moviesServices;
	

	
	@RequestMapping(value="/movies/",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Movies>> getMovies(){
		
		System.out.println("before get");
		List<Movies> movieList = moviesServices.getMovies();
		
		return new ResponseEntity<List<Movies>>(movieList,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/movies/{movieCode}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Movies> getMovieById(@PathVariable("movieCode") String code) throws MovieNotFoundException{

		Movies movie = moviesServices.getMovieByCode(code);
		
		return new ResponseEntity<Movies>(movie,HttpStatus.OK);
	}
	
	@RequestMapping(value="/movies/",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> insertMovie(@RequestBody Movies movie, UriComponentsBuilder uriBuilder){
		System.out.println("Above insertion");
		moviesServices.insertMovies(movie);
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uriBuilder.path("/movies/{code}").buildAndExpand(movie.getMovieCode()).toUri());
		
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
	}
	
@RequestMapping(value="/movies/{movieCode}",method=RequestMethod.DELETE)	
public ResponseEntity<Void> deleteMovie(@PathVariable("movieCode") String code){
	
	moviesServices.deleteMovies(code);
	
	return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
}

/*@ExceptionHandler(MovieNotFoundException.class)
public ResponseEntity<MovieNotFoundException> movieNotFound(HttpServletRequest req,Exception e){
	
	MovieNotFoundException error = new MovieNotFoundException();

	return new ResponseEntity<MovieNotFoundException>(error,HttpStatus.NOT_FOUND);
}*/
	
}



