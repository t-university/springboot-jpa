package com.example.demo;

import java.time.LocalDate;

import javax.persistence.*;

@Entity

public class Invitation {

	private @GeneratedValue @Id Long id;
	private String username;
	private LocalDate creationDate;
	private LocalDate limitDate;
	
	
	//Constructores
	public Invitation() { }
	
	public Invitation(Long id, String username, LocalDate creationDate, LocalDate limitDate) {
		super();
		this.id = id;
		this.username = username;
		this.creationDate = creationDate;
		this.limitDate = limitDate;
	}

	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getLimitDate() {
		return limitDate;
	}

	public void setLimitDate(LocalDate limitDate) {
		this.limitDate = limitDate;
	}

	//toString
	@Override
	public String toString() {
		return "Invitation [id=" + id + ", username=" + username + ", creationDate=" + creationDate + ", limitDate="
				+ limitDate + "]";
	}


	

	

}
