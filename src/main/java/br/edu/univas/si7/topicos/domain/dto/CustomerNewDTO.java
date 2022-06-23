package br.edu.univas.si7.topicos.domain.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class CustomerNewDTO {

	private String cpf;// pesquisar como validar o CPF

	@NotNull(message = "Value can not be null.")
	@NotEmpty(message = "Value can not be empty.")
	@Size(min = 5, max = 80, message = "The size must be between 5 and 80.")
	private String name;

	@NotNull(message = "Value can not be null.")
	@NotEmpty(message = "Value can not be empty.")
	@Email(message = "Invalid email.")
	private String email;

	@NotNull(message = "Value can not be null.")
	private Integer type;

	@NotEmpty(message = "Value can not be empty.")
	private String street;

	@NotNull(message = "Value can not be null.")
	@PositiveOrZero
	private Integer number;

	private String extra;

	@NotEmpty(message = "Value can not be empty.")
	private String neighbour;

	@NotEmpty(message = "Value can not be empty.")
	private String zipCode;

	@NotNull(message = "Value can not be null.")
	@Min(0)
	private String city;

	@NotNull(message = "Value can not be null.")
	@Min(0)
	private String state;

	@NotNull(message = "Phone number can not be null.")
	@NotEmpty(message = "Phone number can not be empty.")
	@Size(min = 8, max = 20, message = "The size must be between 5 and 20.")
	private String phoneNumber;

	public CustomerNewDTO() {
	}

	public CustomerNewDTO(String cpf, String name, String email, Integer type, String street, Integer number,
			String extra, String neighbour, String zipCode, String city, String state, String phoneNumber) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.email = email;
		this.type = type;
		this.street = street;
		this.number = number;
		this.extra = extra;
		this.neighbour = neighbour;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getNeighbour() {
		return neighbour;
	}

	public void setNeighbour(String neighbour) {
		this.neighbour = neighbour;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "CustomerNewDTO [cpf=" + cpf + ", name=" + name + ", email=" + email + ", type=" + type + ", street="
				+ street + ", number=" + number + ", extra=" + extra + ", neighbour=" + neighbour + ", zipCode="
				+ zipCode + ", city=" + city + ", state=" + state + ", phoneNumber=" + phoneNumber + "]";
	}

}
