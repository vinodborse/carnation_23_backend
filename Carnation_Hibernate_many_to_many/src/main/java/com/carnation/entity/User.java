package com.carnation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	private int userId;
	private String name;
	private String address;
	
	
	@ManyToMany
	@JoinTable(name = "u_d",
				joinColumns = {@JoinColumn(name = "usr_id")},
				inverseJoinColumns = {@JoinColumn(name = "dcmnt_id")}
			)
	private List<Document> documents;
	
	
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User :- userId=" + userId + ", name=" + name + ", address=" + address + ", documents=" + documents;
	}
	
	
}
