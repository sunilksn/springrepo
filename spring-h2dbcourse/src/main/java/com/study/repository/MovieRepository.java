package com.study.repository;

import org.springframework.data.repository.CrudRepository;

import com.study.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> 
{

}
