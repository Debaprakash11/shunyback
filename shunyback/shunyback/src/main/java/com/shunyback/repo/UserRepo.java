package com.shunyback.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shunyback.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

}
