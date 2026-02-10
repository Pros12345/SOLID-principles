package Liskov_Substitution_Principle;

class Bird {
}

interface Flyable {
	void fly();
}

class Sparrow extends Bird implements Flyable {
	public void fly() {
		System.out.println("Sparrow flying");
	}
}

class Ostrich extends Bird {
	// no fly method
}
