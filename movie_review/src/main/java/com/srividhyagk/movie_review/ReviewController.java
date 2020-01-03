package com.srividhyagk.movie_review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/review")

public class ReviewController {

	@Autowired
	private ReviewRepository reviewrepo;
	@Autowired
	private MovieRepository movierepo;
	@Autowired
	private UserRepository userrepo;
	

	
	  @PostMapping(path="/add") 
	  public @ResponseBody String addNewReview( @RequestParam(name="movieid") int movie_id,@RequestParam(name="userid") int user_id,
			  @RequestParam(name="comment") String comment,@RequestParam(name="rating") int rating)
	  { 
		Reviews r=new Reviews();
	 r.setMovie_id(movie_id);
	 r.setUser_id(user_id); 
	 r.setComment(comment);
	 r.setRating(rating);
	 reviewrepo.save(r); 
	 return "Saved";
	 
	 }
	 
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Reviews> getAllReviews() {
		return reviewrepo.findAll();
	}

	@GetMapping(path = "/getReview")
	public @ResponseBody List<Reviews> getReviewByUsername(String username) {
		User u=userrepo.findByUsername(username);
		return reviewrepo.findByUser_id(u.getId());
	}
	
	@GetMapping(path = "/getReviewByMovieTitle")
	public @ResponseBody List<Reviews> getReviewByTitle(String title) {
		Movie m=movierepo.findByTitle(title);
		return reviewrepo.findByMovie_id(m.getId());
	
}
}



