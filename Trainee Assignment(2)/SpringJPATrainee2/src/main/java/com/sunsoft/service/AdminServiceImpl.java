package com.sunsoft.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsoft.Entity.User1;
import com.sunsoft.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public Optional<User1> getAdmin(String username) {
		Optional<User1> admin = adminRepository.findById(username);
		return admin;
	}
}
