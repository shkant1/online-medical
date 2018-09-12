package net.sha.medicalbackend.dao;

import java.util.List;

import net.sha.medicalbackend.dto.Address;
import net.sha.medicalbackend.dto.Cart;
import net.sha.medicalbackend.dto.User;

public interface UserDAO {

	// user related operation
	User getByEmail(String email);
	User get(int id);

	boolean add(User user);
	
	// adding and updating a new address
	Address getAddress(int addressId);
	boolean addAddress(Address address);
	boolean updateAddress(Address address);
	Address getBillingAddress(int userId);
	List<Address> listShippingAddresses(int userId);
	

	
}
