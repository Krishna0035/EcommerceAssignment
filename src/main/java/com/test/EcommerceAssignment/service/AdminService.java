package com.test.EcommerceAssignment.service;

import java.util.List;

import com.test.EcommerceAssignment.entities.Admin;

public interface AdminService {
	
	public Admin addAdmin(Admin admin);
	
	public Admin updateAdmin(int id, Admin admin);
	
	public List<Admin> getAllAdmin();
	
	public Admin getAAdmin(int id);
	
	
	
	
}
