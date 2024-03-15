package com.user.resultservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.resultservice.model.Result;

public interface ResultServiceRepository extends JpaRepository<Result, Long>{

	public Result findByStudent(String studentid);

}
