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
@Table(name="optionentry")
public class Optionentry {

	private int id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Field
	private String value_string;
	private Optionset op;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue_string() {
		return value_string;
	}
	public void setValue_string(String value_string) {
		this.value_string = value_string;
	}
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "optiton_set_id")
	public Optionset getOp() {
		return op;
	}
	public void setOp(Optionset op) {
		this.op = op;
	}
	
}
