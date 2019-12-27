package com.aisatec.service;

import java.util.List;

import com.aisatec.model.Order;

public interface OrderService {
	List<Order> list();
	Order get(Long id);
	void save(Order message);
	void delete(Long id);	
}
