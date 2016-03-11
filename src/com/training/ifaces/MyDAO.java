package com.training.ifaces;

import java.util.List;

import com.training.entity.Invoice;

public interface MyDAO<T>{
	
	public boolean add(T t);

	Invoice find(int key);

	List<Invoice> findAll();
}
