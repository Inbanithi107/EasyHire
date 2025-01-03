package com.Techforge.EasyHire.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Techforge.EasyHire.DTO.GlobalResponse;
import com.Techforge.EasyHire.DTO.JobRequest;
import com.Techforge.EasyHire.Service.JobService;

@RestController
@RequestMapping("/job")
public class JobController {
	
	@Autowired
	private JobService service;
	
	@PostMapping("/register")
	public ResponseEntity<GlobalResponse> createjob(@RequestBody JobRequest request) {
		
		service.createjob(request.getUserid(), request.getLabourid(), request.getLocation());
		
		return new ResponseEntity<GlobalResponse>(new GlobalResponse("Job assigned succesfully"), HttpStatus.OK);
		
	}
	
	@PostMapping("/complete")
	public ResponseEntity<GlobalResponse> completejob(@RequestHeader long jobid){
		
		service.completejob(jobid);
		
		return new ResponseEntity<GlobalResponse>(new GlobalResponse("Job completed succesfully"), HttpStatus.OK);
		
	}

}
