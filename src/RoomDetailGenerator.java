import java.text.*;
import java.util.*;

public class RoomDetailGenerator {

	public static void main(String[] args) {

		double length;
		double width;
		double height;

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		// user prompt to enter values of length and width of the classroom

		System.out.println("Welcome to the Room Detail Generator");
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {

			// perform a calculation
			double perimeter;
			double area;
			double volume;

			// display the output

			System.out.print("Enter Length:  ");
			length = sc.nextDouble();

			System.out.print("Enter Width:   ");
			width = sc.nextDouble();

			System.out.print("Enter Height:  ");
			height = sc.nextDouble();

			perimeter = 2 * (length + width);
			area = length * width;
			volume = length * width * height;

			String message = "Area:  " + area + "\n" + "Perimeter:  " + perimeter + "\n" + "Volume:  " + volume + "\n";
			System.out.println(message);

			System.out.print("Continue? (y/n):");
			sc.nextLine();
			choice = sc.nextLine();
			System.out.println();
			// see if the user wants to continue
		}
	}
}
