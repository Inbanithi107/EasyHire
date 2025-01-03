package com.Techforge.EasyHire.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Techforge.EasyHire.DTO.GlobalResponse;
import com.Techforge.EasyHire.Entity.User;
import com.Techforge.EasyHire.Service.UserService;

@RestController
public class GlobalController {
	
	
	User globaluser = new User();
	
	@Autowired
	private UserService service;
	
	@PostMapping("/register")
	public ResponseEntity<GlobalResponse> register(@RequestBody User user){
		
		service.createuser(user);
		
		return new ResponseEntity<GlobalResponse>(new GlobalResponse("User created Succesfully"), HttpStatus.OK);
		
	}
	
	@GetMapping("/login")
	public ResponseEntity<User> login(@RequestParam String username, @RequestParam String password){
		
		User user = service.login(username, password);
		if(user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		
	}
	
	@GetMapping("/currentuser")
	public ResponseEntity<User> currentuser(@RequestHeader long id) {
		User user = service.currentuser(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
		
	}

}
