package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.model.Movie;
import com.study.service.MovieService;

@RestController
public class MovieController 
{
	@Autowired
	private MovieService  movieService;
	
	@GetMapping("/movies")
	private List getAllMovies()
	{
		return movieService.getAllMovies();
	}
	
	@GetMapping("/movies/{id}")
	private Movie getMovieById(@PathVariable("id") int id)
	{
		return movieService.getMovieById(id);
	}
	
	@PostMapping("/movies")
	private int saveMovie(@RequestBody Movie movie)
	{
		movieService.saveOrUpdate(movie);
		return movie.getId();
	}
	
	@DeleteMapping("/movies/{id}")
	private void deleteMovie(@PathVariable("id") int id)
	{
		movieService.deleteMovie(id);
	}
	
	@PutMapping("/movies/{id}")
	private void updateMovieById(@RequestBody Movie movie, @PathVariable int id)
	{
		movieService.updateMovieById(movie, id);
	}

}
