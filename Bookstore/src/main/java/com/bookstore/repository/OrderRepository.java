package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

	Order save(Order order);
	default Order findOne(Long id) { 
        return (Order) findById(id).orElse(null); 
    } 
	

}
