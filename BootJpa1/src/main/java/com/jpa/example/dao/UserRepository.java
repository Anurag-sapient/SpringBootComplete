package com.jpa.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.example.entities.User;

//(entity,id)
public interface UserRepository extends CrudRepository<User,Integer>{
	@Query(value = "SELECT * FROM user u WHERE u.city = ?1",nativeQuery = true)
			List<User> findUserByCityNative(String city);

	List<User>findByName(String string);

}
