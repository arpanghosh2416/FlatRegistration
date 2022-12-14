package com.flat.app.service;

import java.util.List;

import com.flat.app.entity.User;
import com.flat.app.exception.NoUsersFoundException;
import com.flat.app.exception.UserNotFoundException;

public interface UserService {

	public List<User> getAllUsers() throws NoUsersFoundException;

	public User registerUser(User user);

	public User getUserById(String username) throws UserNotFoundException;

}
