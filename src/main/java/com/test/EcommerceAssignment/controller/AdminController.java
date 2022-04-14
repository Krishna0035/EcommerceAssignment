package com.test.EcommerceAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.EcommerceAssignment.entities.Admin;
import com.test.EcommerceAssignment.service.AdminService;

@RestController
@RequestMapping("/com/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	@PostMapping("/create-admin")
	public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin){
		return new ResponseEntity<Admin>(adminService.addAdmin(admin),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/all-admins")
	public ResponseEntity<List<Admin>> getAllAdmin(){
		return new ResponseEntity<List<Admin>>(adminService.getAllAdmin(),HttpStatus.OK);
	}

	
}
