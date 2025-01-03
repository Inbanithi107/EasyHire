package com.Techforge.EasyHire.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Techforge.EasyHire.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findByUsernameAndPassword(String username, String password);

}
