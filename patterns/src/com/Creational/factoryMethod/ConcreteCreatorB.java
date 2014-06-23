package com.Creational.factoryMethod;

public class ConcreteCreatorB extends Creator {
	@Override
	public Product factoryMethod() {
		return new ConcreteProductB();
	}
}
