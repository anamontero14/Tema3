package ejerciciosparte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que lea 10 números por teclado, los almacene en una
		 * tabla, y que luego los muestre en orden inverso, es decir, el primero que se
		 * introduce es el último en mostrarse
		 */

		// variable para almacenar los números
		int num;

		// creación de Scanner
		Scanner leer = new Scanner(System.in);

		// creación de tabla
		int tabla[] = new int[10];

		// for para recoger los números
		for (int i = 0; i < 10; i++) {

			// le pido al usuario los números
			System.out.print("Introduzca un número: ");

			// almaceno el número en la variable
			num = leer.nextInt();

			// almaceno los números en la tabla 1 por 1
			tabla[i] = num;

		}

		// la i vale la longitud de la tabla y hace el bucle mientras la i sea mayor o
		// igual a 0
		for (int i = 9; i >= 0; i--) {
			System.out.print(tabla[i] + ", ");
		}

		// cerrar Scanner
		leer.close();

	}

}
