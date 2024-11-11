package enlgish;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		/*
		 * Write a program that allows the user to store an arithmetic sequence at an
		 * array and then the program will show it on the screen. An arithmetic sequence
		 * is a series of numbers that starts by an initial value V, and then it
		 * continues with increases of a value I. For example, with V=1 and I=2 the
		 * sequence would be: 1, 3, 5, 7, 9… With V=7 and I=10, the sequence would be:
		 * 7, 17, 27, 37 The program will ask the user the values V and I, furthermore
		 * the number of values to create (the length of the array).
		 */

		// DECLARATION OF VARIABLES
		// variable to store the initial value
		int value;

		// variable to store the number i have to increase the value in each iteration
		int increase;

		// variable to store the lenght of the array
		int lenght;

		// initialization of the array
		int table[];

		// creation of the Scanner
		Scanner read = new Scanner(System.in);

		// i tell the user what they have to do
		System.out.print("Introduce the initial value: ");

		// i store the data in the variable
		value = read.nextInt();

		// i tell the user what they have to do
		System.out.print("Introduce the number to increase the values: ");

		// i store the data in the variable
		increase = read.nextInt();

		// i ask the user for the lenght of the array
		System.out.print("Introduce the lenght of the array: ");

		// i store the answer in the variable
		lenght = read.nextInt();

		// i give the lenght to the array already initialized
		table = new int[lenght];

		// the variable i will be the same as the initial value and the loop will
		// continue repeating itself while 'i' is less than lengh
		for (int i = 0; i < lenght; i++) {

			table[i] = value;
			value += increase;

			System.out.print(table[i] + ", ");

		}

		// closing the Scanner
		read.close();

	}

}
