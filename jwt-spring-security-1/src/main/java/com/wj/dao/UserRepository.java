package com.wj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wj.dao.entities.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long>{
	
	public AppUser findByUsername(String username);
	
}
