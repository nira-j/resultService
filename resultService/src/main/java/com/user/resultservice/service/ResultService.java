package com.user.resultservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.resultservice.model.Result;
import com.user.resultservice.repository.ResultServiceRepository;

@Service
public class ResultService {

	@Autowired ResultServiceRepository resultServiceRepository;
	
	public Result getService(String studentid) {
		return resultServiceRepository.findByStudent(studentid);
	}

	public Result saveResult(Result result) {
		return resultServiceRepository.save(result);
	}
}
