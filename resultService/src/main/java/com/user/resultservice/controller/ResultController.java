package com.user.resultservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.resultservice.model.Result;
import com.user.resultservice.service.ResultService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class ResultController {
	
	@Autowired ResultService resultService;
	
	@GetMapping("/get/{studentid}")
	public Result getResult(@PathVariable String studentid) {
		return resultService.getService(studentid);
	}
	
	@PostMapping("/save")
	public Result saveResult(@RequestBody Result result) {
		return resultService.saveResult(result);
	}
	
}
