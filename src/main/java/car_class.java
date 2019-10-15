/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmosi
 */
public class car_class {
	private int speed = 0;
	private String make = "Chevy";
	private int modelYear = 2000;
		
	public car_class (String n, int Model)
	{	
		make = n;
		modelYear = Model; 
	}
	
	public int getyearModel ()
	{
		return modelYear;
	}
	
	public String getMake ()
	{
		return make;
	}
	
	public int getSpeed ()
	{
		return speed;
	}	
		
	public void accelerate ()
	{
		if (speed !=90)
			speed = speed +5;
	}
	
	public void brake ()
	{
		if (speed !=0)
			speed = speed -5;
	}
}
