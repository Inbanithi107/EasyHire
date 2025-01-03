package com.Techforge.EasyHire.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Techforge.EasyHire.Entity.Job;
import com.Techforge.EasyHire.Entity.Labour;
import com.Techforge.EasyHire.Entity.User;
import com.Techforge.EasyHire.Repository.JobRepository;

@Service
public class JobService {
	
	@Autowired
	private JobRepository repository;
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private LabourService labourService;
	
	public void createjob(long userid, long labourid, String location) {
		
		User user = userservice.currentuser(userid);
		
		Labour labour = labourService.findlabourbyid(labourid);
		
		Job job = new Job(true, false, location, labour, user);
		
		repository.save(job);
		
	}
	
	public void completejob(long jobid) {
		
		Optional<Job> job = repository.findById(jobid);
		job.get().setIscompleted(true);
		repository.save(job.get());
	}

}
