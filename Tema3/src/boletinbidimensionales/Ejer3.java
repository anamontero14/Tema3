package boletinbidimensionales;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida las dimensiones de una tabla bidimensional al
		 * usuario (número de filas y número de columnas). A continuación, crea dicha
		 * tabla bidimensional y rellénala de la siguiente forma: el elemento de la
		 * posición [i][j] debe contener el valor 10 * i + j. A continuación, muestra la
		 * tabla por consola.
		 */

		// variable para almacenar el valor de las filas
		int filas;

		// variables para almacenar el valor de las columnas
		int columnas;

		// creacion de la tabla
		int tabla[][];

		// creacion del Scanner
		Scanner leer = new Scanner(System.in);

		// le pido al usuario que introduzca los valores
		System.out.print("Introduzca el número de filas que quiere que tenga la tabla: ");
		// almaceno el dato introducido en la variable
		filas = leer.nextInt();

		// le pido al usuairo el valor para las columnas
		System.out.print("Introduzca el número de columnas que quiere que tenga la tabla: ");
		// almaceno el dato introducidl en la variable columnas
		columnas = leer.nextInt();

		// le doy los valores a la tabla
		tabla = new int[filas][columnas];

		// creo un bucle for para ir rellenando la tabla, que vaya desde 0 hasta el
		// final de la FILA
		for (int i = 0; i < filas; i++) {
			// creo un bucle for interno para las columnas
			for (int j = 0; j < columnas; j++) {
				// asigno a la posición de la tabla 10 por la posición de la fila más la
				// posición de la columna
				tabla[i][j] = 10 * i + j;
			}
		}

		// creo un bucle for para mostrar la matriz
		for (int k = 0; k < filas; k++) {
			// creo un bucle interno para poder mostrar las columnas
			for (int j = 0; j < columnas; j++) {
				System.out.print(tabla[k][j] + "\t");
			}
			System.out.println();
		}

		// cerrar el scanenr
		leer.close();

	}

}
