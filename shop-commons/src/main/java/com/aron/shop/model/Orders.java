package com.aron.shop.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@Column(name="id_order")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrder;
	
	@Column(name="order_date")
	private LocalDateTime OrderDate;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="quantity")
	private Long quantity;
	
	@Column(name="payment")
	private String payment;
	
	@Enumerated(EnumType.STRING)
	private Tracker tracker;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_client")
	private Clients client;

	public Orders() {
	}

	public Orders(Long idOrder, LocalDateTime orderDate, Double price, Long quantity, String payment, Tracker tracker,
			Clients client) {
		super();
		this.idOrder = idOrder;
		OrderDate = orderDate;
		this.price = price;
		this.quantity = quantity;
		this.payment = payment;
		this.tracker = tracker;
		this.client = client;
	}

	public Long getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}

	public LocalDateTime getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		OrderDate = orderDate;
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

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Tracker getTracker() {
		return tracker;
	}

	public void setTracker(Tracker tracker) {
		this.tracker = tracker;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}
}
