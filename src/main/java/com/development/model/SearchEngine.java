package com.development.model;

import java.util.Set;

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
@Table(name="Registration")
public class SearchEngine {

	   @Id
	   @DocumentId
	   @GeneratedValue(strategy = GenerationType.AUTO)	   
	   @Column(name = "USER_ID")
		private int id;
		@Field
		@Column(name = "first_name")
		private String first_name;
		@Column(name = "last_name")
		private String last_name;
		@Field
		@Column(name = "email")
		private String email;
		@Column(name = "password")
		private String password;
		private int is_archived;
		private String password_confirmation;
		private Set<Notification> notification;
		
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public int getIs_archived() {
			return is_archived;
		}
		
		public void setIs_archived(int is_archived) {
			this.is_archived = is_archived;
		}
		
		
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPassword_confirmation() {
			return password_confirmation;
		}
		public void setPassword_confirmation(String password_confirmation) {
			this.password_confirmation = password_confirmation;
		}
		public Set<Notification> getNotification() {
			return notification;
		}
		public void setNotification(Set<Notification> notification) {
			this.notification = notification;
		}
		
		
}
