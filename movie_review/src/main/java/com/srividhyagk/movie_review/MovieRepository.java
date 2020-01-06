package com.srividhyagk.movie_review;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer>{
	Movie findByTitle(String title);
	List<Movie> findByCategory(String category);
}

