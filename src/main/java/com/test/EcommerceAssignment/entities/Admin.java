package com.test.EcommerceAssignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="admin_id")
	private int adminId;
	private String name;
	private String email;
	private String userName;
	private String password;
	private String PhoneNo;
	private String role = "ROLE_ADMIN";
	
	public Admin() {
	}

	public Admin(int adminId, String name, String email, String userName, String password, String phoneNo,
			String role) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.email = email;
		this.userName = userName;
		this.password = password;
		PhoneNo = phoneNo;
		this.role = role;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", email=" + email + ", userName=" + userName
				+ ", password=" + password + ", PhoneNo=" + PhoneNo + ", role=" + role + "]";
	}
	
	
	
	
	
}
