package com.training.daos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.entity.Invoice;

public class InvoiceRowMapper implements RowMapper<Invoice> {

	@Override
	public Invoice mapRow(ResultSet rs, int rowCount) throws SQLException {
		// TODO Auto-generated method stub
		Invoice inv = new Invoice();
		inv.setInvoiceNumber(rs.getInt("invoicenumber"));
		inv.setCustomerName(rs.getString("customername"));
		inv.setAmount(rs.getDouble("invoiceamount"));
		return inv;
	}

}
