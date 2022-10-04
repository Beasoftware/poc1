package com.dev.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "appuser")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String Name;
	@NotNull
	// @Size(min = 2, message = "Please Provide Correct MobileNo")
	private int MobileNo;
	private String Email;
	private String Address;

	public User() {

	}

	public User(int id, String name, int mobileNo, String email, String address) {
		super();
		Id = id;
		Name = name;
		MobileNo = mobileNo;
		Email = email;
		Address = address;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
