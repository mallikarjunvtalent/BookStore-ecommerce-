package com.bookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.Order;
import com.bookstore.domain.ShoppingCart;
import com.bookstore.domain.UserShipping;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem,Long> {

	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	default CartItem findOne(Long id) { 
        return (CartItem) findById(id).orElse(null); 
    }
	List<CartItem> findByOrder(Order order); 
	
}
