package Dependency_Inversion_Principle;

public class Main {
	public static void main(String[] args) {
		InputDevice keyboard = new Keyboard();
		Computer computer = new Computer(keyboard);
		computer.start();
	}
}
