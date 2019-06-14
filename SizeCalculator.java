import java.text.DecimalFormat;

/**
 * CST8110 Introduction to Computer Programming Author: Marconi Fonseca
 * section:330 lab teacher:Anissa Shaddy Assignment #2: Date: Date:Nov 01 2018
 */
public class SizeCalculator { //Calculate the difference between two box volumes

	// Declaring variables 
	private Box firstBox; // First box to compare
	private Box secondBox; // Second box to compare 
	private String message; // Message to be displayed 
	private DecimalFormat df = new DecimalFormat("#.##");  // Decimal format to be used
    // 
	public SizeCalculator() {

		System.out.println("Size calculator - we speak volumes\n "); // Default (no-arg) constructor

	}

	public void inputBoxes() {   // Input the two boxes

		System.out.print("Enter first box dimensions \n");
		firstBox = new Box();
		inputBox(firstBox);
		System.out.print("\nEnter second box dimensions \n");
		secondBox = new Box();
		inputBox(secondBox);
	}

	private void inputBox(Box box) { //Method to simplify box entry
		box.inputLength();
		box.inputWidth();
		box.inputHeight();

	}

	public void calculateSizes() { // Calculate the difference between the two boxes and store the value in message
		if (firstBox.calcVolume() > secondBox.calcVolume()) {

			double diff = firstBox.calcVolume() / secondBox.calcVolume();

			if (diff > 0 && diff <= 2) {
				message = ("The first box is slightly bigger than the second box");
			} else if (diff > 2 && diff <= 2.99) {
				message = ("The first box is “twice” bigger than the second box");
			} else if (diff >= 3 && diff <= 3.99) {
				message = ("The first box is “triple” bigger than the second box");
			} else if (diff >= 4 && diff <= 4.99) {
				message = ("The first box is “quadruple” bigger than the second box");
			} else {
				if (diff >= 5)
					message = ("The first box is " + Math.round(diff) + " times the size of the second box");
			}

		}

		if (firstBox.calcVolume() < secondBox.calcVolume()) {

			double diff = secondBox.calcVolume() / firstBox.calcVolume();

			if (diff > 0 && diff <= 2) {
				message = ("The second  box is slightly bigger than the first box");
			} else if (diff > 2 && diff <= 2.99) {
				message = ("The second box is “twice” bigger than the fisrt box");
			} else if (diff >= 3 && diff <= 3.99) {
				message = ("The second box is “triple” bigger than the first box");
			} else if (diff >= 4 && diff <= 4.99) {
				message = ("The second box is “quadruple” bigger than the first box");
			} else {
				if (diff >= 5)
					message = ("The second box is " + Math.round(diff) + " times the size of the first box");
			}

		}
		if (firstBox.calcVolume() == secondBox.calcVolume()) {
			message = ("The first box is the same size as the second box");
		}

	}

	public void display() {// Display the message
		System.out.print("\nFirst box: ");
		firstBox.displayDimensions();
		System.out.println(" volume = " + df.format(firstBox.calcVolume()));
		System.out.print("Second box: ");
		secondBox.displayDimensions();
		System.out.println(" volume = " + df.format(secondBox.calcVolume()));
		System.out.println(message);
	}

}
