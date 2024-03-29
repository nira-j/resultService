package com.resultservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resultservice.model.AnnualResult;
import com.resultservice.repository.ResultRepository;

@Service
public class ResultService {

	@Autowired ResultRepository resultRepository;
	
	public AnnualResult getResult(Long studentid) {
		return resultRepository.findByStudentid(studentid);
	}
	public AnnualResult saveResult(AnnualResult annualresult ) {
		return resultRepository.save(annualresult);
	}
	

}
