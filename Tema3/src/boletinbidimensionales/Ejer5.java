package boletinbidimensionales;

import java.util.Random;

public class Ejer5 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999.
		 * Estos números se deben introducir en un array de 4 filas por 5 columnas.
		 * Seguidamente, muestra el array por pantalla junto con las sumas parciales de
		 * filas y columnas, igual que si de una hoja de cálculo se tratara. La suma
		 * total debe aparecer en la esquina inferior derecha. Un ejemplo de cómo deben
		 * mostrarse dichas sumas parciales sería
		 */

		// creacion de variable que almacenará los números random
		int numRandom;

		// suma filas
		int sumaColum = 0;

		// suma columnas
		int sumaFila = 0;

		// creacion de la clase random
		Random rand = new Random();

		// creaacion del array
		int tabla[][] = new int[4][5];

		// creacion de bucle
		for (int i = 0; i < 4; i++) {
			// bucle interno para asignarle el valor a las columnas
			for (int j = 0; j < 5; j++) {
				// le asigno en cada iteracion un nº aleatorio entre 100 y 999 a la variable
				numRandom = rand.nextInt(100, 1000);

				// le asigno dicho numero aleatorio a la posicion
				tabla[i][j] = numRandom;

			}
		}

		// muestro la tabla (filas)
		for (int i = 0; i < 4; i++) {
			// bucle interno para mostrar las columnas
			for (int j = 0; j < 5; j++) {
				// voy sumando el valor de las columnas
				sumaFila += tabla[i][j];
				// muestro las columnas
				System.out.print(tabla[i][j] + "\t");

			}

			sumaColum += tabla[i][i];

			// muestro la suma de la columna
			System.out.print("= " + sumaFila + "");

			System.out.println();
		}

		System.out.println(sumaColum + "\t");

	}

}
