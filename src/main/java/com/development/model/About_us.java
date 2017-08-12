package com.development.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

@Entity
@Table(name="about_us")
public class About_us {
	@Id
	@Field
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String comments;
	private int rating_number;
  private String email;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getRating_number() {
		return rating_number;
	}
	public void setRating_number(int rating_number) {
		this.rating_number = rating_number;
	}
}
