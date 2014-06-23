package com.Creational.factoryMethod;

public class ConcreteCreatorA extends Creator {
	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}
}
