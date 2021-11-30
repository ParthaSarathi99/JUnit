package newfeatures;
// Car.java

public interface Vehicle {
	
//	By default all are abstract method
	String getBrand();
	String speedUp();
	String slowDown();
	
//	Any non-abstract method must be made default to add any new feature
	default String turnAlarmOn()
	{
		return "Turning the Vehicle Alarm ON.";
	}
	
	default String turnAlarmOff()
	{
		return "Turning the Vehicle Alarm OFF.";
	}

	static int getHorsePower(int rpm,int torque)
	{
		return (rpm*torque)/5252;
	}
	
	
}
