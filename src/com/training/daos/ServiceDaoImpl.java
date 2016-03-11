package com.training.daos;

import java.util.List;

import javax.sql.RowSet;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.ServiceRequest;
import com.training.ifaces.ServiceDAO;

public class ServiceDaoImpl extends JdbcDaoSupport implements ServiceDAO<ServiceRequest> {

	@Override
	public boolean addServiceRequest(ServiceRequest t) {
		// TODO Auto-generated method stub
		boolean result = false;
		String sql = "insert into Service values (?,?,?,?,?,?)";
		int rowInserted = getJdbcTemplate().update(sql,t.getServiceId(),t.getCust().getCustomerName(),t.getCust().getPhoneNumber(),t.getProd().getProductType(),t.getProd().getProductName(),t.getServiceDesc());
		
		if(rowInserted>0){
			result=true;
		}
		return result;
	}

	
	
	@Override
	public ServiceRequest findServiceDetails(int serviceNo) {
		String sql = "SELECT * FROM service WHERE serviceid=?";
		//ServiceRequest serv = getJdbcTemplate().queryForObject(sql,new BeanPropertyRowMapper<ServiceRequest>(ServiceRequest.class), serviceNo);
		ServiceRequest serv2 =getJdbcTemplate().queryForObject(sql, new ServiceRowMapper(),serviceNo);
		//RowSet rs = (RowSet) getJdbcTemplate().queryForRowSet(sql);
		return serv2;
	}

	@Override
	public List<ServiceRequest> findAllServiceRequests() {
		// TODO Auto-generated method stub
		return null;
	}

}