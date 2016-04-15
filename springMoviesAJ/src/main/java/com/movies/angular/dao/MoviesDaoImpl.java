package com.movies.angular.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.movies.angular.Model.Movies;


@Component("moviesDao")
@Transactional
public class MoviesDaoImpl implements MoviesDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<Movies> getMovies() {
		Session session=null;
		List<Movies> movieList=null;
		try{
			session = sessionFactory.openSession();
			session.getTransaction().begin();
			movieList = session.createQuery("from Movies").list();
			
			return movieList;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		
		
		return movieList;
	}

	public Movies getMovieByCode(String code) {
		Session session1=null;
		Movies movies=null;
		try{
			
			session1 = sessionFactory.openSession();
			session1.getTransaction().begin();
		 movies =	(Movies)session1.get(Movies.class, code);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally{
			session1.close();
		}
		
		return movies;
	}

	public void insertMovies(Movies movie) {
		Session session2=null;
	
		try{
			
			session2 = sessionFactory.openSession();
			session2.getTransaction().begin();
			session2.persist(movie);
			session2.getTransaction().commit();
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally{
			session2.close();
		}
		
	}

	public void deleteMovies(String code) {
		// TODO Auto-generated method stub
		Session session3=null;
		Movies movies=null;
		try{
			
			session3 = sessionFactory.openSession();
			session3.getTransaction().begin();
			movies = (Movies)session3.load(Movies.class, code);
			session3.delete(movies);
			session3.getTransaction().commit();
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally{
			session3.close();
		}
	
		
	}
	
	
	}
	
