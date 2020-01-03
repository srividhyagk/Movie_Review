package com.srividhyagk.movie_review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer>{
//	@Query("select m.title from Movie m")
	Movie findByTitle(String title);
}

