package com.training.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Service")
public class ServiceRequest {
	private int serviceId;
	private String serviceDesc;
	
	@Autowired
	private Customer cust;
	
	@Autowired
	private Product prod;
	public ServiceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceRequest(int serviceId, String serviceDesc, Customer cust, Product prod) {
		super();
		this.serviceId = serviceId;
		this.serviceDesc = serviceDesc;
		this.cust = cust;
		this.prod = prod;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceDesc() {
		return serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	@Override
	public String toString() {
		return "ServiceRequest [serviceId=" + serviceId + ", serviceDesc=" + serviceDesc + ", cust=" + cust + ", prod="
				+ prod + "]";
	}
	
	
}