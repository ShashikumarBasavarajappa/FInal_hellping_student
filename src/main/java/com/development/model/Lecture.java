package com.development.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.lucene.document.Field.Index;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Store;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

@Entity
@Table(name="Lecture")
public class Lecture {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Field
    private int id;
	private int   college_id;
	private String  name;
	private String branch;
	private String active_lecture;
	/*
	 * 
	 * Getter and Settter method of the declaration
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCollege_id() {
		return college_id;
	}
	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getActive_lecture() {
		return active_lecture;
	}
	public void setActive_lecture(String active_lecture) {
		this.active_lecture = active_lecture;
	}	
}
