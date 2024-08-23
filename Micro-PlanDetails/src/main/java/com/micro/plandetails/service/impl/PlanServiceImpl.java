package com.micro.plandetails.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.plandetails.entity.Plan;
import com.micro.plandetails.model.PlanDTO;
import com.micro.plandetails.repository.PlanRepository;
import com.micro.plandetails.service.IPlanService;

@Service
public class PlanServiceImpl implements IPlanService {
	
	@Autowired
	PlanRepository  planRepo;

	@Override
	public List<PlanDTO> getAllPlans() {
		
		List<Plan>  planList=planRepo.findAll();
		
		List<PlanDTO>  planDTOList =new  ArrayList<>();
		
		for(Plan  plan : planList) {
			PlanDTO  dto=new PlanDTO();
			BeanUtils.copyProperties(plan, dto);
			planDTOList.add(dto);
		}
		return  planDTOList;
	}

	@Override
	public PlanDTO getSpecificPlan(String planId) {
		
		Optional<Plan>  opt = planRepo.findById(planId);
		Plan plan=opt.get();
		PlanDTO  dto=new  PlanDTO();
		BeanUtils.copyProperties(plan, dto);
		return  dto;
	}

}
