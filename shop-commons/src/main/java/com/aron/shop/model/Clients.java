package com.aron.shop.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "clients")
public class Clients {

	@Id
	@Column(name="id_client")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="pass")
	private String password;

	@Column(name="role")
	private String role;

	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name="client_email")
	private String clientEmail;
	
	@Column(name="client_phone")
	private String clientPhone;
	
	@Column(name="client_address")
	private String clientAddress;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id_order")
	private List<Orders> orders;
	
	public Clients(){
	}

	public Clients(Long idClient, String firstName, String lastName, String password, String role, LocalDate dateOfBirth,
			String clientEmail, String clientPhone, String clientAddress, List<Orders> orders) {
		super();
		this.idClient = idClient;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
        this.role = role;
		this.dateOfBirth = dateOfBirth;
		this.clientEmail = clientEmail;
		this.clientPhone = clientPhone;
		this.clientAddress = clientAddress;
		this.orders = orders;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() { return role; }

	public void setRole(String role) { this.role = role; }

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}	
	
}
