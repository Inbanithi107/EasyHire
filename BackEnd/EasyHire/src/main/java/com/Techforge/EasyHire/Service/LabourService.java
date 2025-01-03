package com.Techforge.EasyHire.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Techforge.EasyHire.Entity.Labour;
import com.Techforge.EasyHire.Entity.User;
import com.Techforge.EasyHire.Repository.LabourRepository;

@Service
public class LabourService {
	
	@Autowired
	private LabourRepository repository;
	
	@Autowired
	private UserService userService;
	
	public void createlabour(Labour labour, User user) {
		
		labour.setUser(user);
		
		repository.save(labour);
		
	}
	
	public Labour currentlabour(long userid) {
		
		User user = userService.currentuser(userid);
		
		return repository.findByUser(user);
		
	}
	
	public List<Labour> available(){
		return repository.findByIsfreeTrueOrderByRatingDesc();
	}
	
	public Labour findlabourbyid(long labourid) {
		
		return repository.findById(labourid).get();
		
	}

}
