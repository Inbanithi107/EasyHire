package com.Techforge.EasyHire.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Techforge.EasyHire.Entity.User;
import com.Techforge.EasyHire.Fueatures.UserMethods;
import com.Techforge.EasyHire.Repository.UserRepository;

@Service
public class UserService implements UserMethods{
	
	@Autowired
	private UserRepository repository;

	@Override
	public void createuser(User user) {
		
		repository.save(user);
		
	}

	@Override
	public User currentuser() {
		
		return null;
	}
	
	

}
