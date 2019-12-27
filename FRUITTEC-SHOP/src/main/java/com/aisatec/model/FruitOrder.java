package com.aisatec.model;

public class FruitOrder {

	private Fruit fruit;
	private int numFruitS;
	
	public FruitOrder() {
		super();
	}
	
	public FruitOrder(Fruit fruit, int numFruitS) {
		super();
		this.fruit = fruit;
		this.numFruitS = numFruitS;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public int getNumFruitS() {
		return numFruitS;
	}

	public void setNumFruitS(int numFruitS) {
		this.numFruitS = numFruitS;
	}
	
}
