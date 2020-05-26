package com.EmployeeManger.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories
public class EmployeeMangerApplication {
	
	/*
	 * @Autowired RoleService roleservice;
	 */

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMangerApplication.class, args);
	}
	
	/*
	 * //logger initialization private static final Logger logger =
	 * LogManager.getLogger(EmployeeMangerApplication.class);
	 * 
	 * 
	 * @PostConstruct public void init() { if (roleservice.countRows().intValue() !=
	 * 2) { if(roleservice.insert()) { logger.info("Role Updated Successfully...");
	 * } } }
	 */
	
}
