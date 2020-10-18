package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	User findByUsername(String username);
	
	User findByEmail(String email);

	//User findOne(Long id);
	default User findOne(Long id) { 
        return (User) findById(id).orElse(null); 
    } 
}
