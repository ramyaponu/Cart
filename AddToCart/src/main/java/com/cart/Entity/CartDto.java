package com.cart.Entity;

import java.util.List;



import com.NewWorks.Ecommerce.Entity.Products;
import com.registation.Entity.User;

public class CartDto {
	private Integer cartId;
	private User user;
	private List<Products> product;
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Products> getProduct() {
		return product;
	}
	public void setProduct(List<Products> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "CartDto [cartId=" + cartId + ", user=" + user + ", product=" + product + "]";
	}
	public CartDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
