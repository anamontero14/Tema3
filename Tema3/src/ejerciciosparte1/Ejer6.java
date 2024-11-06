package ejerciciosparte1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que pida 8 números enteros y los almacene en una tabla. A
		 * continuación, en un bucle distinto, recorrerá esa tabla y mostrará esos
		 * números junto con la palabra “par” o “impar” según proceda
		 */

		// variable para almacenar los numeros enteros
		int num;

		// variable para averiguar si es par o impar
		int resto;

		// creacion de la tabla
		int tabla[] = new int[8];

		// creacion del Scanner
		Scanner leer = new Scanner(System.in);

		// pido los valores de la tabla
		for (int i = 0; i < 8; i++) {

			// le pido al usuario los datos
			System.out.print("Introduzca un número: ");

			// almacenar el número en la variable
			num = leer.nextInt();

			// le asigo el valor de la variable a la tabla
			tabla[i] = num;
		}

		// bucle para recorrer la tabla y mostrarla
		for (int valor : tabla) {
			System.out.print(valor);

			// averiguo si es par o no
			resto = valor % 2;

			// digo si es par o impar dependiendo de la condición
			if (resto == 0) {
				System.out.print(" par, ");
			} else {
				System.out.print(" impar, ");
			}

		}

		// cerrar scanner
		leer.close();

	}

}
