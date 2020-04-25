package com.sunsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunsoft.Entity.User1;

@Repository("adminRepository")
public interface AdminRepository extends JpaRepository<User1, String>{

}
