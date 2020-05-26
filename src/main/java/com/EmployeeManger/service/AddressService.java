package com.EmployeeManger.service;

import com.EmployeeManger.genericService.GenericService;
import com.EmployeeManger.model.Address;

/**
 * @author SAVAN
 *
 */
public interface AddressService extends GenericService<Address>{

	//remove address  
	void removeAddress(Address address);
	
}
