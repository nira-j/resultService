package com.resultservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resultservice.model.AnnualResult;
import com.resultservice.service.ResultService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class ResultController {
	
	@Autowired ResultService resultService;
	
	@GetMapping("/get/{studentid}")
	public AnnualResult getResult(@PathVariable Long studentid) {
		return resultService.getResult(studentid);
	}
	
	@PostMapping("/save")
	public AnnualResult saveResult(@RequestBody AnnualResult result) {
		return resultService.saveResult(result);
	}
	
}
