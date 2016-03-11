package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.ServiceDaoImpl;
import com.training.entity.Customer;
import com.training.entity.Product;
import com.training.entity.ServiceRequest;

public class ServiceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ServiceBeans.xml");
		
		ServiceDaoImpl obj = ctx.getBean("dao", ServiceDaoImpl.class);
		ServiceRequest servreq = ctx.getBean("Service", ServiceRequest.class);
		
		Customer cust = new Customer("Shariq Parwez", "8084021137");
		Product prod = new Product("Sony Bravia", "TV");
		
		servreq.setCust(cust);
		servreq.setProd(prod);
		servreq.setServiceId(900);
		servreq.setServiceDesc("DISPLAY PROBLEM");
		
		obj.addServiceRequest(servreq);
		
		ServiceRequest serv = obj.findServiceDetails(900);
		System.out.println(serv.getCust().getCustomerName());
		System.out.println(serv);

	}

}