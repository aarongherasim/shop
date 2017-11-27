package com.aron.shop.model;

import javax.persistence.*;

@Entity
@Table(name="reviews")
public class Reviews {
	
	@Id
	@Column(name="id_rev")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRev;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_prod")
	private Products product;

	public Reviews() {
	}

	public Reviews(Long idRev, String description, Products product) {
		super();
		this.idRev = idRev;
		this.description = description;
		this.product = product;
	}

	public Long getIdRev() {
		return idRev;
	}

	public void setIdRev(Long idRev) {
		this.idRev = idRev;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}
	
}
