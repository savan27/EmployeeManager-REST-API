package com.EmployeeManger.controller;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManger.main.EmployeeMangerApplication;
import com.EmployeeManger.service.RoleService;

/**
 * @author SAVAN
 *
 */
@RestController
@RequestMapping(value = "http://localhost:8080/",method = RequestMethod.GET)
public class UserController {
	
	// logger initialization
	private static final Logger logger = LogManager.getLogger(EmployeeMangerApplication.class);
	
	@Autowired	
	RoleService roleservice;

	@PostConstruct
	public void init() {
		if (roleservice.countRows().intValue() != 2) {
			if (roleservice.insert()) {
				logger.info("Role Updated Successfully...");
			}
		}
	}
	
}
