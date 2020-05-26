package com.EmployeeManger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.EmployeeManger.model.User;

/**
 * @author SAVAN
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("from User u where email =?1")
	User findByEmail(String email);
	
}
