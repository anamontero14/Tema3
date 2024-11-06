package ejerciciosparte1;

import java.util.Random;

public class Ejer1 {

	public static void main(String[] args) {

		/*
		 * Crea una tabla de enteros de longitud 10 que se inicializará con números
		 * aleatorios comprendidos entre 1 y 100
		 */

		// números random
		Random rand = new Random();

		for (int i = 1; i <= 10; i++) {

			// almacenar los números random
			int num = rand.nextInt(1, 101);

			// tabla
			int tabla[] = { num };

			// recorrer la tabla
			for (int valor : tabla) {
				System.out.print(valor + ",");
			}

		}

	}

}
