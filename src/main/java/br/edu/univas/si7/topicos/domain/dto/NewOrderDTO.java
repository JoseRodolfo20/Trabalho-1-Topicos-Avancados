package br.edu.univas.si7.topicos.domain.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.edu.univas.si7.topicos.domain.Address;

public class NewOrderDTO {

    @NotNull(message = "Request date can't be null.")
	@NotEmpty(message = "Request date can't be empty.")
	private String dateRequest;

	@NotNull(message = "Customer can't be null.")
	@NotEmpty(message = "Customer can't be empty.")
	private String customer;

	@NotNull(message = "Shipping Address can't be null.")
	private Address shippingAddress;
	
	@NotNull(message = "Product can't be null.")
	private String product;
	
	@NotNull(message = "Product amount can't be null.")
	private Integer productAmount;	
	
	public NewOrderDTO() {}	

	public NewOrderDTO(String dateRequest, String customer, Address shippingAddress, String product, Integer productAmount) {
		this.dateRequest = dateRequest;
		this.customer = customer;
		this.shippingAddress = shippingAddress;
		this.product = product;
		this.productAmount = productAmount;
	}

	public String getDateRequest() {
		return dateRequest;
	}

	public void setDateRequest(String dateRequest) {
		this.dateRequest = dateRequest;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

    
}
