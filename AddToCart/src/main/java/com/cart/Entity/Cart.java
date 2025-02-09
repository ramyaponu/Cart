package com.cart.Entity;

import java.util.List;



import com.NewWorks.Ecommerce.Entity.Products;
import com.registation.Entity.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cartId;
	
	 @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name = "user_id")
	private User user;
	 
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "pro_id")
	private List<Products> product;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
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
		return "Cart [cartId=" + cartId + ", user=" + user + ", product=" + product + "]";
	}
	
	
	
}
