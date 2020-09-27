package com.study.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.model.Movie;
import com.study.repository.MovieRepository;

@Service
public class MovieService 
{
	@Autowired
	private MovieRepository movieRepository;
	
	public List getAllMovies() {
		List movies = new ArrayList();
		movieRepository.findAll().forEach(t -> movies.add(t));

		return movies;
	}
	
	public Movie getMovieById(int id)
	{
		return movieRepository.findById(id).get();
	}
	
	public void saveOrUpdate(Movie movie)
	{
		movieRepository.save(movie);
	}
	
	public void deleteMovie(int id)
	{
		movieRepository.deleteById(id);
	}
	
	public void updateMovieById(Movie movie, int id)
	{
		movieRepository.save(movie);
	}
	
	public void updateMovieDetails()
	{
		System.out.println("test method");
	}
	
	public void updateMovieDetails3()
	{
		System.out.println("test method 3");
	}
}
