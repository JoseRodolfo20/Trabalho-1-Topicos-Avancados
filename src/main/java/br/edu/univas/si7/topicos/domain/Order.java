package br.edu.univas.si7.topicos.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime dateRequest;

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL) // o cascade é para salvar o pagamento automaticamente
																// quando salva o pedido
	private Payment payment;

	@ManyToOne
	@JoinColumn(name = "CUSTOMER_FK")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "SHIP_ADDRESS_FK")
	private Address shippingAddress;

	@OneToMany(mappedBy = "id.order")
	private Set<OrderItem> items = new HashSet<>();

	public Order() {
	}

	public Order(Integer id, LocalDateTime dateRequest, Customer customer, Address shippingAddress) {
		this.id = id;
		this.dateRequest = dateRequest;
		this.customer = customer;
		this.shippingAddress = shippingAddress;
	}

	public List<Product> getProducts() {
		return items.stream().map(i -> i.getProduct()).collect(Collectors.toList());
	}

	public void addItems(OrderItem... items) {
		this.items.addAll(Arrays.asList(items));
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDateRequest() {
		return dateRequest;
	}

	public void setDateRequest(LocalDateTime dateRequest) {
		this.dateRequest = dateRequest;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Set<OrderItem> getItems() {
		return items;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
