package ejerciciosparte1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
		 * valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará
		 * en qué posiciones del array aparece N
		 */

		// creación del numero aleatorio
		Random rand = new Random();

		// creacion de la variable para el valor que habrá que mostrar
		int mostrar = 0;

		// variable para poder salir
		boolean salir = false;

		// crear la tabla
		int tabla[] = new int[100];

		// creacion del scanner
		Scanner leer = new Scanner(System.in);

		// creo el bucle
		for (int i = 0; i < 100; i++) {
			// asigno que variable almacenara el random
			int num = rand.nextInt(1, 11);

			// asigno los valores a la tabla
			tabla[i] = num;
		}

		// comprobar la entrada
		do {

			// comprobación
			try {
				// le digo al usuario que me introduzca el valor que quiere buscar
				System.out.print("Introduzca el valor a buscar: ");

				// almaceno la respuesta en la variable
				mostrar = leer.nextInt();

				// establecer el rango
				assert mostrar >= 0 && mostrar <= 10 : "Error. Valor a buscar fuera del rango.";

				// si no hay excepción entonces se sale
				salir = true;

				// para el error de asserción
			} catch (AssertionError a) {
				System.err.println(a.getMessage());
			} catch (InputMismatchException e) {
				// mostrar el error
				System.err.println("Error. Debe introducir un número.");
			} finally {
				// limpiar el buffer
				leer.nextLine();
			}

		} while (!salir);

		// recorrer la tabla
		for (int i = 0; i < 100; i++) {
			// si lo que hay en la tabla es igual a mostrar
			if (tabla[i] == mostrar) {
				// muestra el valor de la i
				System.out.println("Posición: " + i);
			}
		}

		// cerrar el scanner
		leer.close();

	}

}
