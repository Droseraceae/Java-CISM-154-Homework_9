
/**
 * Write a description of class CarDemo here.
 * 
 * @author Josh Alcoba
 * @version 12/8/2015
 */
class CarDemo {

	public static void main(String[] args) {

		Car car = new Car("Honda", "Civic", "Green", 2008, 0);

		System.out.println("The make of the car is a(n) " + car.getMake());
		System.out.println("The model of the car is a(n) " + car.getModel());
		System.out.println("The colour of the car is " + car.getColor());
		System.out.println("The year of the car is " + car.getYear());

		for (int i = 0; i < 5; i++) {
			car.accelerate();
			System.out.println("The " + car.getColor() + " " + car.getYear() + " " + car.getMake() + " "
					+ car.getModel() + " is going " + car.getSpeed());
		}

		for (int i = 7; i >= 0; i--) {
			car.decelerate();
			System.out.println("The " + car.getColor() + " " + car.getYear() + " " + car.getMake() + " "
					+ car.getModel() + " is going " + car.getSpeed());
		}

	}

}
