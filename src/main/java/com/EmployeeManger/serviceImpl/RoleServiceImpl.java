package com.EmployeeManger.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManger.enume.RoleType;
import com.EmployeeManger.model.Role;
import com.EmployeeManger.repository.RoleRepository;
import com.EmployeeManger.service.RoleService;

/**
 * @author SAVAN
 *
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public Long countRows() {
		return roleRepository.count();
	}

	@Override
	public boolean insert() {

		// set admin role
		Role admin = new Role();
		admin.setRole(RoleType.ADMIN.name());

		// set user role
		Role user = new Role();
		user.setRole(RoleType.USER.name());

		Role adminid = roleRepository.save(admin);
		Role userid = roleRepository.save(user);

		if (adminid != null && userid != null) {
			return true;
		}
		return false;
	}

	@Override
	public Role findByRole(String roleName) {
		return roleRepository.findByRole(roleName);
	}

}
