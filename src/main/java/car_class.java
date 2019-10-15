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
    public static void main (String [] str)
	{
		Car car1 = new Car("Chevy", 2000);
		for (int i = 1; i <= 5; i++)
		{
			car1.accelerate();
			System.out.println("Current speed is: " + car1.getSpeed());
		}
		for (int j = 1; j <= 5; j++)
		{
			car1.brake();
			System.out.println("Current speed is: " + car1.getSpeed());
		}		
		
	}
}
