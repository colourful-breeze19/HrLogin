package com.nagarro.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author chahat
 *
 */
@Entity
@Table(name = "loginhr")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "password")
	private String pass;

	
	
	public User() {

	}


	
	/**
	 * @param firstName
	 * @param pass
	 */
	public User(String firstName, String pass) {
		super();
		this.firstName = firstName;
		this.pass =pass;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


}
