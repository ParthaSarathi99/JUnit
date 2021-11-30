package newfeatures;

// DefaultMethodDemo
// Vehicle.java
public class Car implements Vehicle {

	private String brand;
	
	Car(String brand)
	{
		this.brand=brand;
	}
	
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "Vehicle is speeding up!!!";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "Vehicle is Slowing Down!!!";
	}


}
