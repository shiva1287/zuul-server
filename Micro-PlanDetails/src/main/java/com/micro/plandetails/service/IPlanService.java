package com.micro.plandetails.service;

import java.util.List;

import com.micro.plandetails.model.PlanDTO;

public interface IPlanService {
	
	List<PlanDTO>  getAllPlans();
	
	PlanDTO   getSpecificPlan(String planId);

}
