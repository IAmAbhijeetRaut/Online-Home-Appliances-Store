package com.sunbeam.services;

import java.util.List;

import com.sunbeam.entities.User;
import com.sunbeam.model.UserCred;

public interface UserService {
	User findById(int id);
	User findByEmail(String email);
	User save(User user);
	User authenticate(String email, String password);
	List<User> findAll();
	User login(String email, String password);
	String forgotPassword(String email);
	String resetPassword(String token, String password);
	User updateUser(int userid, UserCred cred);
}