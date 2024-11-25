package boletin5;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		/*
		 * Realiza una función que reciba como parámetro una tabla bidimensional de
		 * enteros y un valor. Debe devolver un booleano indicando si dicho valor se
		 * encuentra en la tabla o no
		 */

		// creación de la tabla bidimensional
		int tabla[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		// variable para almacenar el valor a buscar
		int valor = 0;

		// variable para almacenar la funcion
		boolean funcion;

		// creacion de scanner
		Scanner leer = new Scanner(System.in);

		// pregunto al usuario por el valor a buscar
		System.out.print("¿Qué valor desea buscar en el array?: ");
		// y almaceno la respuesta en la variable
		valor = leer.nextInt();

		// almaceno la funcion en la variable
		funcion = encuentraOno(tabla, valor);

		// muestro la solucion
		System.out.println("\n" + funcion);

		// cerrar scanner
		leer.close();

	}

	static boolean encuentraOno(int[][] tabla, int valor) {

		// variable para indicar si el valor se encuentra o no
		boolean encontrado = false;

		// recorro las filas
		for (int fila[] : tabla) {
			// recorro las columnas
			for (int colum : fila) {
				// si el valor de las columnas nunca es igual al valor introducido entonces
				// iguala la variable a false
				if (valor == colum) {
					encontrado = true;
				}
			}
		}

		return encontrado;

	}

}
