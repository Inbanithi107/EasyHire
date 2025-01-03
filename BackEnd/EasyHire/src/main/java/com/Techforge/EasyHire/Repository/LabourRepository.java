package com.Techforge.EasyHire.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Techforge.EasyHire.Entity.Labour;
import com.Techforge.EasyHire.Entity.User;

public interface LabourRepository extends JpaRepository<Labour, Long> {
	
	Labour findByUser(User user);
	
	List<Labour> findByIsfreeTrueOrderByRatingDesc();
	
	

}
