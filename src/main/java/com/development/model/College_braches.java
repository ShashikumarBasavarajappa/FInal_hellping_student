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
@Table(name="College_braches")
public class College_braches {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Field
	private int id;

	private int college_id;
	private String  branch_name;
	private int  is_active_brach;
	
	public int getIs_active_brach() {
		return is_active_brach;
	}
	public void setIs_active_brach(int is_active_brach) {
		this.is_active_brach = is_active_brach;
	}
	
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
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	
}
