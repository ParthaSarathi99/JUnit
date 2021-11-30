package newfeatures;

// car.java
// vehicle.java
public class DefaultMethodDemo {
	
	public static void main(String[] args) {
		
		Vehicle car=new Car("BMW");
		
//		invoking overridden methods 
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
//		invoking default methods
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
		
//		invoking static method of interface
		System.out.println(Vehicle.getHorsePower(2500, 400));
		
	}
	
}
