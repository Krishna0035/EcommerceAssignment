package com.test.EcommerceAssignment.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int productId;
	private String productName;
	private Long productPrice;
	private String productDescription;
	private String type;
	private LocalDate date;
	
	@OneToOne
	@JoinColumn(name="admin_id",referencedColumnName = "admin_id")
	private Admin admin;

	
	
	
	
	public Product() {
	
	}





	public Product(int productId, String productName, Long productPrice, String productDescription, String type,
			LocalDate date, Admin admin) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.type = type;
		this.date = date;
		this.admin = admin;
	}





	public int getProductId() {
		return productId;
	}





	public void setProductId(int productId) {
		this.productId = productId;
	}





	public String getProductName() {
		return productName;
	}





	public void setProductName(String productName) {
		this.productName = productName;
	}





	public Long getProductPrice() {
		return productPrice;
	}





	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}





	public String getProductDescription() {
		return productDescription;
	}





	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}





	public String getType() {
		return type;
	}





	public void setType(String type) {
		this.type = type;
	}





	public LocalDate getDate() {
		return date;
	}





	public void setDate(LocalDate date) {
		this.date = date;
	}





	public Admin getAdmin() {
		return admin;
	}





	public void setAdmin(Admin admin) {
		this.admin = admin;
	}





	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDescription=" + productDescription + ", type=" + type + ", date=" + date + ", admin="
				+ admin + "]";
	}
	
	
	
	
	
	
	
	
	
}
