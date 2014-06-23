package com.Creational.singleton;

public class Singleton {

	protected static Singleton singleton;
	private int i = 1;

	public Singleton() {

	}

	public static Singleton Instance() {
		if (singleton == null) {
			System.out.println("只实例化一次");
			singleton = new Singleton();
		}
		return singleton;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Singleton s = Singleton.Instance();
			if(i==10){
				s.i = 10;
			}
			System.out.println(s.i);
		}
	}

}
