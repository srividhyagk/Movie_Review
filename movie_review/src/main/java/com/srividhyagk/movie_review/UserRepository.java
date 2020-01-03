package com.srividhyagk.movie_review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface UserRepository extends CrudRepository<User,Integer>{
	//@Query("select u.username from User u")
	User findByUsername(String username);

}

