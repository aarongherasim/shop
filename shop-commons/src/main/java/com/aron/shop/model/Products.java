package com.aron.shop.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@Column(name="id_product")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducts;
	
	@Column(name="prod_name")
	private String prodName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="quantity")
	private Long quantity;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "products")
    @JoinTable(name = "providers_products")
    @JsonBackReference
    private List<Provider> providers;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_cat")
	private Categories categories;
	
	@OneToMany(fetch =FetchType.LAZY)
	@JoinColumn(name="id_rev")
	private List<Reviews> reviews; 
	
	public Products() {
	}

	public List<Reviews> getReviews() {
		return reviews;
	}

	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setProvider(Categories categories) {
		this.categories = categories;
	}

	public Products(Long idProducts, String prodName, String description, Double price, Long quantity,
			List<Provider> providers, Categories categories, List<Reviews> reviews) {
		super();
		this.idProducts = idProducts;
		this.prodName = prodName;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.providers = providers;
		this.categories = categories;
		this.reviews = reviews;
	}

	public Long getIdProducts() {
		return idProducts;
	}

	public void setIdProducts(Long idProducts) {
		this.idProducts = idProducts;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}
}
