package com.training.ifaces;

import java.sql.SQLException;
import java.util.List;

public interface ServiceDAO<T> {
	public boolean addServiceRequest(T t);
	public T findServiceDetails(int serviceNo);
	public List<T> findAllServiceRequests();
}