package com.srividhyagk.movie_review;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
@Id //primary key
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

private String username;

//constructors
protected User() {}

public User(int id, String username) {
	super();
	this.id = id;
	this.username = username;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + "]";
}



}
