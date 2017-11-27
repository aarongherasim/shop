package com.aron.shop.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "provider")
public class Provider {
	
	@Id
	@Column(name="id_provider")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProvider;
	
	@Column(name="provider_name")
	private String providerName;
	
	@Column(name="provider_address")
	private String providerAddress;
	
	@Column(name="provider_email")
	private String providerEmail;
	
	@Column(name="provider_phone")
	private String providerPhone;
	
	@ManyToMany
	@JoinTable(name="providers_products", joinColumns = {
			@JoinColumn(name="id_provider", referencedColumnName="id_provider")
	}, inverseJoinColumns = {
			@JoinColumn(name="id_product", referencedColumnName="id_product")
	})
	private List<Products> products;
	
	public Provider() {
	}

	

	public Provider(Long idProvider, String providerName, String providerAddress, String providerEmail,
			String providerPhone, List<Products> products) {
		super();
		this.idProvider = idProvider;
		this.providerName = providerName;
		this.providerAddress = providerAddress;
		this.providerEmail = providerEmail;
		this.providerPhone = providerPhone;
		this.products = products;
	}



	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}



	public Long getIdProvider() {
		return idProvider;
	}

	public void setIdProvider(Long idProvider) {
		this.idProvider = idProvider;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderAddress() {
		return providerAddress;
	}

	public void setProviderAddress(String providerAddress) {
		this.providerAddress = providerAddress;
	}

	public String getProviderEmail() {
		return providerEmail;
	}

	public void setProviderEmail(String providerEmail) {
		this.providerEmail = providerEmail;
	}

	public String getProviderPhone() {
		return providerPhone;
	}

	public void setProviderPhone(String providerPhone) {
		this.providerPhone = providerPhone;
	}
}
