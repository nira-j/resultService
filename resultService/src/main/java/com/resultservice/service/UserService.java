package com.resultservice.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resultservice.dto.SigninDto;
import com.resultservice.dto.SignupDto;
import com.resultservice.model.Role;
import com.resultservice.model.User;
import com.resultservice.repository.UserRepository;


@Service
public class UserService {

	@Autowired UserRepository userRepository;
	
	public SigninDto getUser(String username, String password) {
		
		SigninDto signindto=new SigninDto();
		User user=userRepository.findByUsernameAndPassword(username, password);
		
		signindto.setId(user.getId());
		signindto.setFirstname(user.getFirstname());
		signindto.setLastname(user.getLastname());
		signindto.setMobileno(user.getMobileno());
		signindto.setProfileimage(user.getMobileno());
		signindto.setProfilesignature(user.getProfilesignature());
		signindto.setUsername(user.getUsername());
		
		return signindto;
				
	}
	public SignupDto saveUser(SignupDto signupdto) {
		
		User user=new User();
		user.setEmailid(signupdto.getEmailid());
		user.setFirstname(signupdto.getFirstname());
		user.setLastname(signupdto.getLastname());
		user.setMobileno(signupdto.getMobileno());
		user.setPassword(signupdto.getPassword());
		user.setProfileimage(signupdto.getProfileimage());
		user.setProfilesignature(signupdto.getProfilesignature());
		user.setUsername(signupdto.getFirstname()+"_"+signupdto.getLastname());
		user.setStatus("Y");
		
		Role role=new Role();
		role.setRolename(signupdto.getRole());
		
		Set<Role> roleset = new HashSet<>();
		roleset.add(role);
		user.setRoles(roleset);
		
		userRepository.save(user);
		return signupdto;
		
	}
	
}
