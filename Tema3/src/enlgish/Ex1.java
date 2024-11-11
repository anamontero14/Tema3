package enlgish;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		/*
		 * Write a program that creates an array to store 10 integer numbers. Then, it
		 * must show de next menu: a. Show values. b. Introduce a value. c. Exit. Option
		 * 
		 * ‘a’ will show all the values on the screen. Option ‘b’ will ask for a value V
		 * and a position P and then it will write that value V on the position P of the
		 * array. The menu will be shown indefinitely until the user chooses the option
		 * ‘c’.
		 */

		// variable declaration
		int table[] = new int[10];

		// variable to store the choice of the user
		String answer;

		// variable to store the values
		int value;

		// variable to store the position of the array
		int position;

		// variable to exit the loop
		boolean exit = false;

		// initialization of the Scanner
		Scanner read = new Scanner(System.in);

		// ask the user for an option
		System.out.println("Choose an option: \na. Show values\nb. Introduce a value\nc. Exit. ");

		// store the answer on the variable
		answer = read.nextLine();

		// meanwhile the answer ISNT c the loop will keep going (repeating itself)
		while (!answer.equalsIgnoreCase("c") && !exit) {

			// check the answer
			switch (answer) {

			case "a" -> {
				System.out.println(Arrays.toString(table));

				System.out.println();
			}

			case "b" -> {
				// i ask the user to introduce a value on screen
				System.out.print("Introduce a value: ");

				// store the value in the variable
				value = read.nextInt();

				// i ask the user to introduce a position on screen
				System.out.print("Introduce a position: ");

				// store the answer in the variable
				position = read.nextInt();

				// i equal the position the user introduced to the value the user introduced
				table[position] = value;

				// clean the buffer
				read.nextLine();
			}

			case "c" -> {
				exit = true;
			}

			default -> {
				System.err.println("Incorrect option.");
			}

			}

			// ask the user for an option
			System.out.println("Choose an option: \na. Show values\nb. Introduce a value\nc. Exit. ");

			// store the answer on the variable
			answer = read.nextLine();

		}

		// i tell the user that they're out of the loop
		System.out.println("End of the program.");

		// closing Scanner
		read.close();

	}

}
