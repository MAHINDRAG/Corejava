package com.app.oops;

class Mammal{
	void eat(Mammal m){
		System.out.println("Mammal eats food");
	}
}
class Cattle extends Mammal{
	void eat(Cattle c){
		System.out.println("Cattle eats hay");
	}
}
class Horse extends Cattle{
	void eat(Horse h){
		System.out.println("Horse eats hay");
	}
}
public class InheritanceConcept {

	public static void main(String[] args) {
		Mammal h = new Horse();
		Cattle c = new Horse();
		c.eat(h);
		
		Mammal m = new Mammal();
		Horse h1 = new Horse();
		m = h1;
	}
}
