package com.training.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.Invoice;
import com.training.ifaces.MyDAO;

public class InvoiceDAOImpl extends JdbcDaoSupport implements MyDAO<Invoice> {

	@Override
	public boolean add(Invoice t) {
		boolean result = false;
		String sql = "insert into Invoice values (?,?,?)";
		int rowInserted = getJdbcTemplate().update(sql,t.getInvoiceNumber(),t.getCustomerName(),t.getAmount());
		
		if(rowInserted>0){
			result=true;
		}
		return result;
	}

	@Override
	public Invoice find(int key) {
		String sql = "SELECT * FROM invoice WHERE invoicenumber=?";
		Invoice inv = getJdbcTemplate().queryForObject(sql,new BeanPropertyRowMapper<Invoice>(Invoice.class), key);
		return inv;
	}

	@Override
	public List<Invoice> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM invoice";
		//List<Invoice>
		return null;
	}

}