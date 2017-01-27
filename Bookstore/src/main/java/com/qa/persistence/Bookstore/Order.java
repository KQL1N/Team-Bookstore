package com.qa.persistence.Bookstore;
import javax.persistence.*;

@Entity
public class Order
{
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderID;

	@OneToOne(cascade = CascadeType.ALL)
	private int customerID;
	
	public int getOrderID()
	{
		return orderID;
	}

	public void setOrderID(int orderID)
	{
		this.orderID = orderID;
	}

	public int getCustomerID()
	{
		return customerID;
	}

	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}
}
