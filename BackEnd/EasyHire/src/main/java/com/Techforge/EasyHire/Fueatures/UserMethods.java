package com.Techforge.EasyHire.Fueatures;

import com.Techforge.EasyHire.Entity.User;

public interface UserMethods {
	
	void createuser(User user);
	
	User currentuser(long id);
	
	User login(String username, String password);

}
