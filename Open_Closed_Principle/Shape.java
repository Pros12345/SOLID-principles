package Open_Closed_Principle;

interface Shape {
	double area();
}

class Circle implements Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangle implements Shape {
	double length, width;

	Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}

	public double area() {
		return length * width;
	}
}

class AreaCalculator {
	public double calculate(Shape shape) {
		return shape.area();
	}
}
