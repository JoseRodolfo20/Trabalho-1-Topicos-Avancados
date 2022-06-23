package br.edu.univas.si7.topicos.domain.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.edu.univas.si7.topicos.domain.Customer;

public class CustomerDTO {

	private String id;

	private String name;

	private String email;

	private Integer type;

	@NotNull(message = "Phone number can not be null.")
	@NotEmpty(message = "Phone number can not be empty.")
	@Size(min = 8, max = 20, message = "The size must be between 5 and 20.")
	private String phoneNumber;

	private List<AddressDTO> addresses = new ArrayList<>();

	public CustomerDTO() {
	}

	public CustomerDTO(Customer customer) {
		this.id = customer.getId();
		this.name = customer.getName();
		this.email = customer.getEmail();
		this.type = customer.getType().getCode();
		this.phoneNumber = customer.getPhoneNumber();
		customer.getAddresses().forEach(a -> addresses.add(new AddressDTO(a)));
	}

	public CustomerDTO(String id, String name, String email, Integer type,
			@NotNull(message = "Phone number can not be null.") @NotEmpty(message = "Phone number can not be empty.") @Size(min = 8, max = 20, message = "The size must be between 5 and 20.") String phoneNumber,
			List<AddressDTO> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.type = type;
		this.phoneNumber = phoneNumber;
		this.addresses = addresses;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<AddressDTO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressDTO> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", name=" + name + ", email=" + email + ", type=" + type + ", phoneNumber="
				+ phoneNumber + ", addresses=" + addresses + "]";
	}

}