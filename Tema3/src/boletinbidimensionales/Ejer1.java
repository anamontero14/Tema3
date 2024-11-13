package boletinbidimensionales;

import java.util.Arrays;

public class Ejer1 {

	public static void main(String[] args) {
		/*
		 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y
		 * asigna los valores según la siguiente tabla. Muestra el contenido de todos
		 * los elementos del array dispuestos en forma de tabla como se muestra en la
		 * figura
		 */

		// variable contador
		int cont = 0;

		// creacion del array
		int num[][] = new int[3][6];

		// asigno los números al array
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 3;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		// creación del bucle para mostrar la matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				// mostrar la tabla
				System.out.print(num[i][j] + ", ");
			}
			System.out.println();
		}

	}

}
