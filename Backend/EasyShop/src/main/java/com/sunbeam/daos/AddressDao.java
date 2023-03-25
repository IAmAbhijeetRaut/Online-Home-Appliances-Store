package com.sunbeam.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Address;

public interface AddressDao extends JpaRepository<Address, Integer>{
	Address findByAddressid(int id);
}
