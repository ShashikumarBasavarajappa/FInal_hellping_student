package com.development.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class User {

	private int id;
	private String username;
	private String password;
	private String email;
	private Set<Notification> notification;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Notification> getNotification() {
		return notification;
	}
	public void setNotification(Set<Notification> notification) {
		this.notification = notification;
	}
	
	
}
