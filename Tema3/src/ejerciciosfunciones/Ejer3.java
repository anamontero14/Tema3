package ejerciciosfunciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		/*
		 * Escribir la función int[] rellenaPares(int longitud, int fin), que crea y
		 * devuelve una tabla ordenada de la longitud especificada, que se encuentra
		 * rellena con números pares aleatorios comprendidos entre 2 hasta fin inclusive
		 */

		// creación del Scanner
		Scanner leer = new Scanner(System.in);

		// creo la clase random
		Random rand = new Random();

		// creo la variable que almacenará los números random
		int numRand;

		// creo una variable para comprobar si el número es par o no
		int comprobar;

		// creo una variable contador para recorrer la tabla
		int contador = 0;

		// variable para almacenar la respuesta del usuario
		int longitud = rellenaPares("Introduzca el valor de la longitud: ");

		// creo la variable para el fin
		int fin = rellenaPares("Introduzca el nº final a crear aleatoriamente: ");

		// inicializo la tabla
		int tabla[];

		// establezco la longitud de la tabla
		tabla = new int[longitud];

		// creo bucle para meter los números en la tabla
		while (contador < tabla.length) {

			do {
				numRand = rand.nextInt(0, fin + 1);

				// comrpuebo si el número es par
				comprobar = numRand % 2;

				// si la comprobación es igual a cero
				if (comprobar == 0) {
					// iguala ese número random
					tabla[contador] = numRand;
				}
				// sigue haciendolo mientras que comprobar no sea igual a 0
			} while (comprobar != 0);

			// incremento el contador en cada iteración
			contador++;
		}

		// muestro la tabla
		System.out.println(Arrays.toString(tabla));

	}

	// creo la funcion para preguntar
	static int rellenaPares(String mensaje) {

		// creación del Scanner
		Scanner leer = new Scanner(System.in);

		// le pregunto al usuario por la longitud de la tabla
		System.out.print(mensaje);

		return leer.nextInt();
	}

}
