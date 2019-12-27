package com.aisatec.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aisatec.dao.OrderDAO;
import com.aisatec.model.Order;
import com.aisatec.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;

	@Transactional(readOnly = true)
	public List<Order> list() {
		Iterable<Order> iterable = null;
		iterable = orderDAO.findAll();
		return (iterable != null ? StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList()) : null);
	}

	@Transactional(readOnly = true)
	public Order get(Long id) {
		Order model = null;
		model = orderDAO.findById(id).get();
		return model;
	}

	@Transactional
	public void save(Order message) {
		orderDAO.save(message);
	}

	@Transactional
	public void delete(Long id) {
		orderDAO.deleteById(id);
	}

}
