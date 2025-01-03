package com.Techforge.EasyHire.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Techforge.EasyHire.DTO.GlobalResponse;
import com.Techforge.EasyHire.Entity.Labour;
import com.Techforge.EasyHire.Service.LabourService;
import com.Techforge.EasyHire.Service.UserService;

@RestController
@RequestMapping("/labour")
public class LabourController {
	
	@Autowired
	private LabourService labourService;
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/register")
	public ResponseEntity<GlobalResponse> registerlabour(@RequestHeader long userid, @RequestBody Labour labour){
		
		labourService.createlabour(labour, userservice.currentuser(userid));
		
		return new ResponseEntity<GlobalResponse>(new GlobalResponse("Labour registration successfull"), HttpStatus.OK);
		
	}
	
	@GetMapping("/labour")
	public ResponseEntity<Labour> currentlabour(long userid){
		
		return new ResponseEntity<Labour>(labourService.currentlabour(userid), HttpStatus.OK);
		
	}
	
	@GetMapping("/available")
	public ResponseEntity<List<Labour>> availablelabour(){
		return new ResponseEntity<List<Labour>>(labourService.available(), HttpStatus.OK);
	}

}
