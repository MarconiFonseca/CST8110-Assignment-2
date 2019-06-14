import java.util.Scanner;

/**
 * CST8110 Introduction to Computer Programming Author: Marconi Fonseca
 * section:330 lab teacher:Anissa Shaddy 
 * Assignment #2:
 * Date:Nov 01 2018
 */

public class Box {// Declaring a class method

	private double length;// Declaring variables
	private double width;
	private double height;
	private Scanner input = new Scanner(System.in);

	//Scanner input  // users input

	public Box() { // default constructor
		length = 0;
		width = 0;
		height = 0;
	}

	public Box(double l, double w, double h) {// Initial constructor
		length = l;
		width = w;
		height = h;

	}

	public Box(Box initialBox) {// copy constructor
		length = initialBox.length;
		width = initialBox.width;
		height = initialBox.height;

	}

	// Declaring methods

	public void inputLength() {
		
		System.out.print("Enter length:");// Input length value
		length = input.nextDouble();
	}
	public void inputWidth() {
		System.out.print("Enter Width:"); // Input width value
		width = input.nextDouble();
	}
	public void inputHeight() {
		System.out.print("Enter Height:");// Input height value
		height = input.nextDouble();
	}
	
	public void displayDimensions() { // Display the box in the proper format
		System.out.print(length + " X " + width + " X " + height);
	}

	public double calcVolume() { // Calculate the box volume
 
		return (length * width * height);
	}

		
}
