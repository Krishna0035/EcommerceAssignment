package com.test.EcommerceAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.EcommerceAssignment.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
