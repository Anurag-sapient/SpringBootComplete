package com.jpa.example;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.example.dao.UserRepository;
import com.jpa.example.entities.User;

@SpringBootApplication
public class BootJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootJpa1Application.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		//with each save id also get updated 
		
		//save an id
//		User user= new User();
//		user.setCity("mumbai");
//		user.setName("chavi");
//		user.setStatus("java programmer");
//		userRepository.save(user);
//		System.out.println(u);
		
//-------------------------------------------------------------------------------------------------------		
		//UPDATE-how to edit already stored one
//		Optional<User> optional=userRepository.findById(6);
//		User userg=optional.get();
//		userg.setName("abc");
//		User u=userRepository.save(userg);
//		System.out.println(u);
	
//-------------------------------------------------------------------------------------------------------
		//GET- how to get every value stored
//		Iterable<User>itr=userRepository.findAll();
//		itr.forEach(users->{System.out.println(users);});

		//-------------------------------------------------------------------------------------------------------
//		userRepository.deleteById(7);
//		Iterable<User>itr1=userRepository.findAll();
//		itr1.forEach(users->{System.out.println(users);});
		
//-------------------------------------------------------------------------------------------------------
		
		//make own query without writing any query
		//but we can use our query also-
//		https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
//			-findByName
//			-findByStatus
//			-findByCity
//		List<User>a=userRepository.findByName("anurag");
//		System.out.println(a);
		
		//-------------------------------------------------------------------------------------------------------	
		//native query that is written in repository
		List<User>l=(List<User>) userRepository.findUserByCityNative("delhi");
		System.out.println(l);
	}

}
