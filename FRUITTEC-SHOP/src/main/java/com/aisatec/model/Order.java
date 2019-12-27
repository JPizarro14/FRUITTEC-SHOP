package com.aisatec.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "ORDER")
public class Order {

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "orderId", required = true)
	@NotNull
	private Long id;
	
	@Column(name = "LFRUITS", nullable = false, unique = true)
	@ApiModelProperty(notes = "List Order Fruits", required = true)
	@NotNull
	private List<FruitOrder> listFruits;
	
	public Order() {
		super();
	}
	
	public Order(Long id, List<FruitOrder> listFruits) {
		super();
		this.id = id;
		this.listFruits = listFruits;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<FruitOrder> getListFruits() {
		return listFruits;
	}

	public void setListFruits(List<FruitOrder> listFruits) {
		this.listFruits = listFruits;
	}
	
}
