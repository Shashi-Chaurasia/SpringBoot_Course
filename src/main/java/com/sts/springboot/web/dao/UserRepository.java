package com.sts.springboot.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sts.springboot.web.entities.User;



public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("select u FROM User u")
	public List<User> getAllUser();
	
	@Query("select u FROM User u WHERE u.name =:n")
	public List<User> getUserByName(@Param("n") String name);

	

}
