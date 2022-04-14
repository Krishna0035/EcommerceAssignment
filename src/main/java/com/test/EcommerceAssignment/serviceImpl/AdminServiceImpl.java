package com.test.EcommerceAssignment.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.EcommerceAssignment.entities.Admin;
import com.test.EcommerceAssignment.repository.AdminRepository;
import com.test.EcommerceAssignment.service.AdminService;




@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	
	@Override
	public Admin addAdmin(Admin admin) {
		
		return adminRepository.save(admin);
	}

	@Override
	public Admin updateAdmin(int id, Admin admin) {
		
		Admin admin1 = adminRepository.findById(id).get();
		
		admin.setAdminId(admin1.getAdminId());
		
		
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> getAllAdmin() {
		
		return adminRepository.findAll();
	}

	@Override
	public Admin getAAdmin(int id) {
		return adminRepository.findById(id).get();
	}

}
