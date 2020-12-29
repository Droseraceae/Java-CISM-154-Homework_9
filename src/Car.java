/*
 * @Author Josh Alcoba
 * 
 * Demonstrating function of encapsulation and classes in OOP.
 * 
 * */

public class Car {

	private String make;
	private String model;
	private String color;
	private int year;
	private int speed;

	public Car(String make, String model, String color, int year, int speed) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.speed = speed;

	}

	// Getters
	String getMake() {
		return make;
	}

	String getModel() {
		return model;
	}

	String getColor() {
		return color;
	}

	int getYear() {
		return year;
	}

	public void accelerate() {
		speed += 10;
	}

	int getSpeed() {
		return speed;
	}

	public void decelerate() {
		speed -= 10;
		if (speed < 0) {
			System.exit(0);
		}
	}

}