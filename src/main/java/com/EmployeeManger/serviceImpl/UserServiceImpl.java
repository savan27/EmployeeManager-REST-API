package com.EmployeeManger.serviceImpl;

import java.util.Optional;

import com.EmployeeManger.model.User;
import com.EmployeeManger.service.UserService;

/**
 * @author SAVAN
 *
 */
public class UserServiceImpl implements UserService {

	@Override
	public boolean save(User entity) {
		return false;
	}

	@Override
	public Optional<User> getById(Long id) {
		return null;
	}

}
