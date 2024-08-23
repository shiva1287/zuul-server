package com.micro.customer.service;


import com.micro.customer.model.CustomerDto;
import com.micro.customer.model.LoginDTO;
import com.micro.customer.model.RegisterDTO;

public interface ICustomerService {
	boolean  registerCustomer(RegisterDTO  registerDto);
	boolean  loginCustomer(LoginDTO  loginDto);
	CustomerDto  readCustomer(Long phoneNumber);
}
