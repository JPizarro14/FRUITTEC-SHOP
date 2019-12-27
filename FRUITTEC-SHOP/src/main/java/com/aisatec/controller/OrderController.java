package com.aisatec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aisatec.model.Order;
import com.aisatec.service.OrderService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/Shop")
@Api (value = "Order Microservice", description = "This API has a CRUD for orders")
public class OrderController {

	@Autowired
    private OrderService orderService;
	
	@GetMapping("/order")
	public List getOrders() {
		return orderService.list();
	}

	@GetMapping("/order/{id}")
	public ResponseEntity getOrder(@PathVariable("id") Long id) {
		Order order = null;
		order = orderService.get(id);
		if (order == null) {
			return new ResponseEntity("No order found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(order, HttpStatus.OK);
	}

	@PostMapping(value = "/order")
	public ResponseEntity createOrder(@RequestBody Order order) {
		orderService.save(order);
		return new ResponseEntity(order, HttpStatus.OK);
	}

	@DeleteMapping("/order/{id}")
	public ResponseEntity deleteOrder(@PathVariable Long id) {
		orderService.delete(id);
		return new ResponseEntity(id, HttpStatus.OK);
	
	}

	@PutMapping("/message/{id}")
	public ResponseEntity updateOrder(@RequestBody Order order) {
		orderService.save(order);
		return new ResponseEntity(order, HttpStatus.OK);
	}

}