package com.dev.springboot;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
	@Autowired
	UserRepository UserRepository;

	public List<User> getAllUser() {
		List<User> user = new ArrayList<User>();
		UserRepository.findAll().forEach(user1 -> user.addAll(user));
		return user;
	}

	public User getUserById(int userid) {
		return UserRepository.findById(id).get();
	}

	public void delete(int userid) {
		UserRepository.deleteById(id);

	}

	public void saveOrUpdate(User user) {
		UserRepository.save(user);

	}

}
