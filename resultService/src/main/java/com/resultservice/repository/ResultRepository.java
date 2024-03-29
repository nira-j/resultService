package com.resultservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resultservice.model.AnnualResult;


public interface ResultRepository extends JpaRepository<AnnualResult, Long>{

	public AnnualResult findByStudentid(Long studentid);

}
