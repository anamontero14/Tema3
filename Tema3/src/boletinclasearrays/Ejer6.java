package boletinclasearrays;

import java.util.Arrays;
import java.util.Random;

public class Ejer6 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que cree dos tablas, la primera con los 6 números de una
		 * apuesta de la primitiva generados aleatoriamente entre 1 y 49 y, la segunda
		 * (ordenada) con los 6 números de la combinación ganadora. La combinación
		 * ganadora debe establecerse en el momento de crear la tabla. El programa
		 * devolverá el número de aciertos.
		 */

		// creación de la clase random
		Random random = new Random();

		// creación de la tabla 1
		int tabla1[] = new int[6];

		// creación de la tabla 2
		int tabla2[] = { 23, 45, 29, 18, 29, 4, };

		// variable donde almacenar los números random
		int numRandom;

		// variable que almacenará el número de aciertos
		int aciertos = 0;

		// asignación de los valores random a la tabla
		for (int i = 0; i < 6; i++) {
			// creo un número random desde 1 hasta 50 - 1 y lo almaceno en numRandom
			numRandom = random.nextInt(1, 50);

			// asigno la variable numRandom a la tabla
			tabla1[i] = numRandom;
		}

		// ordeno la segunda tabla
		Arrays.sort(tabla2);

		// muestro ambas tablas
		System.out.println("Sus números: " + Arrays.toString(tabla1));
		System.out.println("Números premiados: " + Arrays.toString(tabla2));

		// va buscando hasta 6
		for (int i = 0; i < 6; i++) {
			// si tabla1 x es igual que tabla2 x
			if (tabla1[i] == tabla2[i]) {
				// incrementa aciertos
				aciertos++;
			}

		}
		// muestro sus aciertos
		System.out.println("Usted ha tenido: " + aciertos + " aciertos");

	}

}
