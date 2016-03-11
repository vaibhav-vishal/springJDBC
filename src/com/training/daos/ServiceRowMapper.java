package com.training.daos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.entity.Customer;
import com.training.entity.Invoice;
import com.training.entity.Product;
import com.training.entity.ServiceRequest;

public class ServiceRowMapper implements RowMapper<ServiceRequest> {

	@Override
	public ServiceRequest mapRow(ResultSet rs, int rowCount) throws SQLException {
		// TODO Auto-generated method stub
		ServiceRequest serv = new ServiceRequest();
		Customer cust = new Customer();
		Product prod = new Product();
		
		serv.setServiceId(rs.getInt("serviceid"));
		cust.setCustomerName(rs.getString("customername"));
		cust.setPhoneNumber(rs.getString("customerphone"));
		prod.setProductType(rs.getString("producttype"));
		prod.setProductName(rs.getString("productname"));
		serv.setServiceDesc(rs.getString("servicedesc"));
		
		serv.setCust(cust);
		serv.setProd(prod);
		
		return serv;
	}

}	