package boletinclasearrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
		 * primeros en un array y los 10 últimos en otro array. Por último, comparará
		 * ambos arrays y le dirá al usuario si son iguales o no
		 */

		// inicialización de la variable que almacena el valor pedido al usuario
		int num = 0;

		// variable para poder salirme del do while de comprobación
		boolean salir = false;

		// variable que almacenará si las tablas son iguales o no
		boolean comprobación;

		// creación de los arrays
		int primeros[] = new int[10];
		int ultimos[] = new int[10];

		// creación de Scanner
		Scanner leer = new Scanner(System.in);

		// bucle para pedir los valores
		for (int i = 0; i < 10; i++) {

			// comprobar la entrada
			do {

				try {
					// introduce 10 numeros
					System.out.print("Introduce 10 valores: ");

					// almacena la entrada en la variable
					num = leer.nextInt();

					// igualar salir a true
					salir = true;

				} catch (InputMismatchException e) {
					System.err.println("Debe introducir un número");
				} finally {
					// limpiar el buffer
					leer.nextLine();
				}
			} while (!salir);

			// almaceno los números primeros en la tabla
			primeros[i] = num;
		}

		salir = false;

		for (int i = 0; i < 10; i++) {
			// comprobar la entrada
			do {

				try {
					// introduce 10 numeros
					System.out.print("Introduce otros 10 valores: ");

					// almacena la entrada en la variable
					num = leer.nextInt();

					// igualar salir a true
					salir = true;

				} catch (InputMismatchException e) {
					System.err.println("Debe introducir un número");
				} finally {
					// limpiar el buffer
					leer.nextLine();
				}
			} while (!salir);

			// almaceno los números primeros en la tabla
			ultimos[i] = num;
		}

		// comparación de tablas y almacenamiento en la variable
		comprobación = Arrays.equals(primeros, ultimos);

		// mostrarle el mensaje al usuario
		if (comprobación == true) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas no son iguales");
		}

		// cerrar Scanner
		leer.close();

	}

}
