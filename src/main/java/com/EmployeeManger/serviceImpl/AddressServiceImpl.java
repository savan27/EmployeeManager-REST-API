package com.EmployeeManger.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.EmployeeManger.model.Address;
import com.EmployeeManger.repository.AddressRepository;
import com.EmployeeManger.service.AddressService;

/**
 * @author SAVAN
 *
 */
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressRepository addressRepository;

	@Override
	public boolean save(Address entity) {
		return false;
	}

	@Override
	public Optional<Address> getById(Long id) {
		return null;
	}

	@Override
	public void removeAddress(Address address) {
		addressRepository.delete(address);
	}

}
