package com.micro.plandetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.plandetails.entity.Plan;
@Repository
public interface PlanRepository extends JpaRepository<Plan, String> {
	
}
