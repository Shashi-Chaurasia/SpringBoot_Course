package com.sts.springboot.web;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sts.springboot.web.dao.UserRepository;
import com.sts.springboot.web.entities.User;

@SpringBootApplication
public class FirststsprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirststsprojectApplication.class, args);
		UserRepository beanRepository = context.getBean(UserRepository.class);

		// -------------------------------Create--------------------------
		/*
		  User user1 = new User(); user1.setName("Shashi Chaurasia");
		  user1.setCity("Siwan"); user1.setStatus("I am Software Engineer");
		  
		  User user2 = new User(); user2.setName("Vinita"); user2.setCity("up");
		  user2.setStatus("I am Software Engineer");
		  
		  
		  User user3 = new User(); user3.setName("sutanshu"); user3.setCity("patna");
		  user3.setStatus("I  Engineer");
		  
		  
		  User user4 = new User(); user4.setName("Ramu Chaurasia");
		  user4.setCity("Purwanchal"); user4.setStatus("I Mechnaical ");
		  
		  ArrayList<User> listUser = new ArrayList<>(); listUser.add(user1);
		  listUser.add(user2); listUser.add(user3); listUser.add(user4);
		  
		  Iterable<User> saveAll = beanRepository.saveAll(listUser);
		  
		  saveAll.forEach(user -> {System.out.println(listUser);});
		  
		  */
		 

		/*
		 * User save = beanRepository.save(user); System.out.println("User date is : " +
		 * save);
		 */

		// ------------------------Update----------------------------------------
		/*
		 * Optional<User> optional = beanRepository.findById(3);
		 * 
		 * User user = optional.get(); System.out.println(user);
		 * user.setName("rameswar Singh"); User save = beanRepository.save(user);
		 * System.out.println(save);
		 */

		// -------------------------Get----------------------------------------------

		// ---Multiple Data----
		/*
		 * Iterable<User> allUser = beanRepository.findAll();
		 * 
		 * allUser.forEach(user -> {System.out.println(allUser);});
		 */

		// -----------------------------Delete------------------------------------------

		/*
		 * beanRepository.deleteById(11);
		 * 
		 * System.out.println(beanRepository.findById(11));
		 */
		/*
		 * Iterable<User> iterable = beanRepository.findAll();
		 * 
		 * iterable.forEach(user -> {System.out.println(iterable);});
		 * 
		 * beanRepository.deleteAll();
		 */
		
		
		//--------------- Custom user---------------------------
		/*
		 List<User> allUser = beanRepository.getAllUser();
		 
		 allUser.forEach(e -> {System.out.println(e);});*/
		
		List<User> byName = beanRepository.getUserByName("Vinita");
		
		byName.forEach(e -> {System.out.println(e);});
		

	}

}
