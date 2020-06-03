package objectclasses;

public class Entry {
    
	public static void main(String[] args) 
	{
	//construction of your house (classes) --> blue print of print
    // blue print has all the details you can think of but it is not an object
	Car c1 = new Car();
	Car c2 = new Car();
	c1.colour = "Gray";
	c2.colour = "White";
// 
	c1.maxSpeed = 120;
	c2.maxSpeed = 90;
	c1.sMode1Name = "Audi Q7";
	c2.sMode1Name = "Audi Q5";
	
	System.out.println("colour1: "+ c1.colour+" MaxSpeed1: "+c1.maxSpeed+ " Model1Name1: "+c1.sMode1Name+"::"+Car.fualType);
	System.out.println("colour2: "+ c2.colour+" MaxSpeed2: "+c2.maxSpeed+ " Model1Name2: "+c2.sMode1Name+"::"+Car.fualType);
	c1.maxSpeed = 150;
	Car.fualType="Petrol";
	System.out.println("*********************************");
	System.out.println("colour1: "+ c1.colour+" MaxSpeed1: "+c1.maxSpeed+ " Model1Name1: "+c1.sMode1Name+"::"+Car.fualType);
    System.out.println("colour2: "+ c2.colour+" MaxSpeed2: "+c2.maxSpeed+ " Model1Name2: "+c2.sMode1Name+"::"+Car.fualType);	
    c1.specialFeature();
    Car.specialFeature();
    // Static and non-static
	// it won't change, never change
	// Static means Single memory for all instances
	// Static variables can be accessed without object/ using class name 
	}
  // static methods can call only static methods, it cannot call non-static methods 
	// in non-static method you can call static and non-static
	// static methods can access static variables only but not non-static variables
}
