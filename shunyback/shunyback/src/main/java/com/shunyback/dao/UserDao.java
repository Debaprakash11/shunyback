package com.shunyback.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shunyback.dto.User;
import com.shunyback.repo.UserRepo;
@Repository
public class UserDao {
	@Autowired
	private UserRepo userRepo;
	public User saveUser(User user) {	
		return userRepo.save(user);
	}
	public User updateUser(User user) {
		return userRepo.save(user);
	}
	public Optional<User> getUser(int id) {
		return userRepo.findById(id);
	}
	
	public List<User> getAll() {
		return userRepo.findAll();
	}
	public void deleteUser(int id) {
		userRepo.deleteById(id);
		
	}

}
