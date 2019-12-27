package com.aisatec.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aisatec.model.Order;

@Repository
public interface OrderDAO extends CrudRepository<Order, Long> {

}
