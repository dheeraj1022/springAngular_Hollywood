package com.movies.angular.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@Entity
@Table(name="Movies")
public class Movies {

	@Id
	private String movieCode;
	private String movieName;
	private String imdbRating;
	private Date releaseDate;
	
	
	public String getMovieCode() {
		return movieCode;
	}
	
	public void setMovieCode(String movieCode) {
		this.movieCode = movieCode;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	
	@Override
	public String toString() {
		return "Movies [movieCode=" + movieCode + ", movieName=" + movieName + ", imdbRating=" + imdbRating
				+ ", releaseDate=" + releaseDate + "]";
	}
	
	
	
	
	
}
