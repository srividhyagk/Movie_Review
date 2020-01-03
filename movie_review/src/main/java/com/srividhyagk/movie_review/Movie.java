package com.srividhyagk.movie_review;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

	@Id // primary key
	private int id;

	private String title;
	private String Category;

	// constructors
	protected Movie() {}
	public Movie(int id, String title, String category) {
		super();
		this.id = id;
		this.title = title;
		Category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", Category=" + Category + "]";
	}

}
