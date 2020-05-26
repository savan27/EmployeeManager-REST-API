package com.EmployeeManger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManger.model.Address;

/**
 * @author SAVAN
 *
 */
public interface AddressRepository extends JpaRepository<Address, Long> {

}
