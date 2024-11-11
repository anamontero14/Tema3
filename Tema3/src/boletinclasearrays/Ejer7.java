package boletinclasearrays;

import java.util.Arrays;

public class Ejer7 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de tipo entero e introduzca la siguiente
		 * secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta
		 * introducir 10 diez veces el 10, y luego la muestre por pantalla. En esta
		 * ocasión has de utilizar Arrays.fill().
		 */

		// creación de la tabla
		int tabla[] = new int[55];

		// inicio
		int inicio = 0;

		// hasta
		int hasta = 1;

		// numero
		int num = 1;

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j <= i; j++) {

				Arrays.fill(tabla, inicio, hasta, num);

				System.out.print(tabla[i] + ", ");

				inicio++;
				hasta++;
				num++;

			}
		}

	}

}
