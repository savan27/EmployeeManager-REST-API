package com.EmployeeManger.service;

import com.EmployeeManger.model.Role;

/**
 * @author SAVAN
 *
 */
public interface RoleService {
	
	// check number of rows
	Long countRows();

	// insert role again
	boolean insert();

	// find Role by name
	public Role findByRole(String roleName);

}
