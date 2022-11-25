package com.example.feedback.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NotNull
	@Size(min=2, message = "Name should have atleast 2 characters")
	@Column(name = "name")
	private String name;
	
	private int ratings;
	@NotNull
	@Size(min=2, message = "Name should have atleast 2 characters")
	@Column(name = "reviews")
	private String reviews;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(Long id,String name, int ratings, String reviews) {
		super();
		this.id=id;
		this.name = name;
		this.ratings = ratings;
		this.reviews = reviews;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Feedback [name=" + name + ", ratings=" + ratings + ", reviews=" + reviews + "]";
	}

}
