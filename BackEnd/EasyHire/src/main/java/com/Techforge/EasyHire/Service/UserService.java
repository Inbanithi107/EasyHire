package com.Techforge.EasyHire.Service;

import java.util.Optional;

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
	public User currentuser(long id) {
		Optional<User> user = repository.findById(id);
		return user.get();
	}

	@Override
	public User login(String username, String password) {
		Optional<User> optuser = repository.findByUsernameAndPassword(username, password); 
		if(optuser.isEmpty()) {
		return null;
		}
		return optuser.get();
	}
	
	

}
