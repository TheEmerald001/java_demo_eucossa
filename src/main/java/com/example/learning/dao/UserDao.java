/**
 * 
 */
package com.example.learning.dao;

import java.util.List;

import com.example.learning.entities.UserDetails;

/**
 * @author DccLxxVii
 *
 */
public interface UserDao {
	
	List<UserDetails> getUserDetails();

	public void createUser(UserDetails userDetails);

}
