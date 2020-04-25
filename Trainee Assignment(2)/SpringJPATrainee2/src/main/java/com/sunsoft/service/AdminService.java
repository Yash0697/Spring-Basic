package com.sunsoft.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sunsoft.Entity.User1;

@Service
public interface AdminService {

	public Optional <User1> getAdmin(String username);
}
