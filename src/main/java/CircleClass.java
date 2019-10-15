
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmosi
 */
public class CircleClass {
    public static void main(String[] args) {

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Ask user to input circle radius
    System.out.print("Enter the radius of a circle: ");
    double radius = keyboard.nextDouble();

    // close keyboard
    keyboard.close();

    // Create a Circle object passing in user input
    CircleClass circleClass = new CircleClass();
    Circle circle = circleClass.new Circle(radius);

    // Display circle information
    System.out.println("Area is " + circle.getArea());
    System.out.println("Diameter is " + circle.getDiameter());
    System.out.println("Circumference is " + circle.getCircumference());

}
}
