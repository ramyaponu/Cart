package com.cart.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NewWorks.Ecommerce.Entity.Products;
import com.cart.Entity.Cart;
import com.cart.Entity.CartDto;
import com.cart.Repository.CartRepository;

@Service
public class CartService {

	@Autowired
	CartRepository cartrepo;
	
	public Cart addToCart(Integer productId) {
		Cart c=new Cart();
List<Products> list=new ArrayList<>();
		
		Products pr=new Products();
	      pr.getProductId();
	      pr.getProductName();
	      pr.getProductDescription();
	    list.add(pr);
	     c.setProduct(list);
	    
		return cartrepo.save(c);
	}
	
	
	
	
}
