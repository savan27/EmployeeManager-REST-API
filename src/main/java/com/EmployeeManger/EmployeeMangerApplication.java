package com.EmployeeManger;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.EmployeeManger.service.RoleService;

@SpringBootApplication
public class EmployeeMangerApplication {

	@Autowired
	private RoleService roleservice;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMangerApplication.class, args);
	}

	// logger initialization
	private static final Logger logger = LogManager.getLogger(EmployeeMangerApplication.class);

	@PostConstruct
	public void init() {
		if (roleservice.countRows().intValue() != 2) {
			if (roleservice.insert()) {
				logger.info("Role Updated Successfully...");
			}
		}
	}

}
