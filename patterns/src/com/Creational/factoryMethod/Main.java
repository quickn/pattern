package com.Creational.factoryMethod;

public class Main {
	
	public static void main(String[] args) {
		Creator[] creators = new Creator[2];
		creators[0] = new ConcreteCreatorA();
		creators[1] = new ConcreteCreatorB();
		for (Creator creator : creators) {
			Product product = creator.factoryMethod();
			product.product();
			System.out.println(product.getClass().getName());
		}
	}
}
