package com.aron.shop.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="categories")
public class Categories {
	
	@Id
	@Column(name="id_cat")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	
	@Column(name="name")
	private String name;
	
	@OneToMany
	private List<Products> products;

	public Categories() {
	}


	public Categories(Long idCat, String name, List<Products> products) {
		super();
		this.idCat = idCat;
		this.name = name;
		this.products = products;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}



	public Long getIdCat() {
		return idCat;
	}

	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
