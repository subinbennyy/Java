package inheritance;

public class Car extends Vehicle {
	String model="TOYOTA";
	public void show()
	{
		System.out.println("Model of car");
		System.out.println("Speed of the car is :"+acceleration);
	}
	

	public static void main(String[] args) {
		
		Car c=new Car();
	    c.run();
		c.show();
		System.out.println(c.model);
		System.out.println(c.acceleration);
		

	}

}
