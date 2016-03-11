package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.InvoiceDAOImpl;
import com.training.entity.Invoice;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		InvoiceDAOImpl obj = ctx.getBean("dao", InvoiceDAOImpl.class);
		Invoice inv = ctx.getBean("Invoice", Invoice.class);
		
		/*inv.setInvoiceNumber(201);
		inv.setCustomerName("Shariq");
		inv.setAmount(4500.00);
		
		boolean result = obj.add(inv);
		
		System.out.println("Row Added := " + result);*/
		
		Invoice inv2 = obj.find(201);
		System.out.println(inv2);
	}

}