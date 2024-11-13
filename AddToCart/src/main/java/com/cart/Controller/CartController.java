package com.cart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.NewWorks.Ecommerce.Entity.Products;
import com.cart.Entity.Cart;

import com.cart.Service.CartService;

@RestController
public class CartController {

	
	
	@Autowired
	CartService cartser;
	
	@GetMapping("/cart/{productId}")
	public Cart addcart(@PathVariable Integer productId) {
	return 	cartser.addToCart(productId);
		
	}
}
