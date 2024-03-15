package com.user.resultservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="result")
public class Result {
	@Id
	private Long id;
	private Integer scanno;
	private String name;
	private String fname;
	private String mname;
	private String dob;
	private String gender;
	private String category;
	private String blood_group;
	private String student_photo;
	private String student_signature;
	private String mobile;
	private String status;
	private String userid;
	private String admit_id;
	private String student_id;
	private String course;
	private String courseid;
	private String mediam;
	private String enrollment_no;
	private String rollno;
	private String college_code;
	private String college_name;
	private String degree;
	private String degree_code;
	private String semyr;
	private String semyr_code;
	private String stud_type;
	private String subcode;
	private String subject;
	
	private String sub1p1;
	private String sub1p1code;
	private String sub1p2;
	private String sub1p2code;
	private String sub1p3;
	private String sub1p3code;
	private String sub2p1;
	private String sub2p1code;
	private String sub2p2;
	private String sub2p2code;
	private String sub2p3;
	private String sub2p3code;
	private String sub3p1;
	private String sub3p1code;
	private String sub3p2;
	private String sub3p2code;
	private String sub3p3;
	private String sub3p3code;
	private String sub4p1;
	private String sub4p1code;
	private String sub4p2;
	private String sub4p2code;
	private String sub4p3;
	private String sub4p3code;
	private String sub5p1;
	private String sub5p1code;
	private String sub5p2;
	private String sub5p2code;
	private String sub5p3;
	private String sub5p3code;
	private String sub6p1;
	private String sub6p1code;
	private String sub6p2;
	private String sub6p2code;
	private String sub6p3;
	private String sub6p3code;
	private String sub7p1;
	private String sub7p1code;
	private String sub7p2;
	private String sub7p2code;
	private String sub7p3;
	private String sub7p3code;
	private String sub8p1;
	private String sub8p1code;
	private String sub8p2;
	private String sub8p2code;
	private String sub8p3;
	private String sub8p3code;
	private String sub9p1;
	private String sub9p1code;
	private String sub9p2;
	private String sub9p2code;
	private String sub9p3;
	private String sub9p3code;
	private String result;
	
	
}
