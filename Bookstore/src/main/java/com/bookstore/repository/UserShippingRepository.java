package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.UserPayment;
import com.bookstore.domain.UserShipping;

public interface UserShippingRepository extends CrudRepository<UserShipping, Long>{
	
	default UserShipping findOne(Long id) { 
        return (UserShipping) findById(id).orElse(null); 
    } 
	
}
