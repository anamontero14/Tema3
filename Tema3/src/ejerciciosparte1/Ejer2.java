package ejerciciosparte1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		/*
		 * Diseñar un programa que solicite al usuario 5 números decimales y los
		 * almacene en una tabla. Utiliza el mismo bucle tanto para solicitar los 5
		 * números como para almacenarlos en la tabla. A continuación, en un bucle
		 * distinto, mostrar por consola los números en el mismo orden en el que se han
		 * introducido
		 */

		// variable para almacenar los números
		double num;

		// creación de la tabla
		double tabla[] = new double[5];

		// creación de Scanner
		Scanner leer = new Scanner(System.in);

		// for para ir contando hasta 5
		for (int i = 0; i <= 4; i++) {

			// le digo al usuario lo que debe hacer
			System.out.print("Introduzca un número decimal: ");

			// recojo el número
			num = leer.nextDouble();

			// almaceno en la tabla
			tabla[i] = num;
		}

		// mostrar la tabla
		for (double valor : tabla) {
			System.out.print(valor + ", ");
		}

		// cerrar Scanner
		leer.close();

	}

}
