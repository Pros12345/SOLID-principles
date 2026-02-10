package Dependency_Inversion_Principle;

interface InputDevice {
	void connect();
}

class Keyboard implements InputDevice {
	public void connect() {
		System.out.println("Keyboard connected");
	}
}

class Mouse implements InputDevice {
	public void connect() {
		System.out.println("Mouse connected");
	}
}

class Computer {
	private InputDevice device;

	Computer(InputDevice device) {
		this.device = device;
	}

	void start() {
		device.connect();
	}
}
