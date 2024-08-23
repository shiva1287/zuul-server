package com.micro.calldetails.service;

import java.util.List;

import com.micro.calldetails.model.CallDetailsDto;

public interface ICallDetailsService {
	List<CallDetailsDto>  readCallDetails(Long  phoneNumber);

}
