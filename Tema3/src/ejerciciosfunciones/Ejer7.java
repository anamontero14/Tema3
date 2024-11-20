package ejerciciosfunciones;

import java.util.Arrays;
import java.util.Random;

public class Ejer7 {

	public static void main(String[] args) {

		/*
		 * Realiza una función que reciba una tabla de dos dimensiones. A continuación,
		 * debe devolver un array de dos posiciones que contenga el mínimo en la
		 * posición 0 y el máximo en la posición 1. Define un método main que rellene un
		 * array de 6 filas por 10 columnas con números enteros positivos comprendidos
		 * entre 0 y 1000 (ambos incluidos). A continuación, debe llamar a la función
		 * con este array y mostrar por consola los valores mínimo y máximo de la tabla
		 */

		// creación de clase random
		Random rand = new Random();

		// creacion de variable que almacenara el numero random para las filas
		int numRand;

		// creación de tabla bidimensional
		int tabla[][] = new int[6][10];

		// variable para recoger la funcion
		int funcion[];

		// creación de bucle para rellenar la tabla
		for (int i = 0; i < tabla.length; i++) {
			// bucle para recorrer las columnas
			for (int j = 0; j < tabla[i].length; j++) {
				// creo un número random entre 0 y 1000 en la variable numRand
				numRand = rand.nextInt(0, 1001);

				// le asigno el número random
				tabla[i][j] = numRand;
			}

		}

		funcion = maximoMinimo(tabla);

		// System.out.println(Arrays.deepToString(tabla));

		// muestro la solucion
		System.out.println("Máximo y mínimo de la tabla creada: " + Arrays.toString(funcion));

	}

	/*
	 * creación de función, funcionalidad: devolver un array de 2 posiciones, en
	 * ellas conteniendo el máximo y el mínimo de la tabla
	 */
	static int[] maximoMinimo(int tabla[][]) {
		// creación de la tabla que contendrá el máximo y el mínimo
		int resultado[] = new int[2];

		// creación de las variables que almacenarán el valor máximo y el valor mínimo
		// respectivamente
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;

		// creación de bucle que buscará el máximo y el mínimo
		for (int i = 0; i < tabla.length; i++) {
			// recorrer las columnas
			for (int j = 0; j < tabla[i].length; j++) {
				maximo = Math.max(maximo, tabla[i][j]);
				minimo = Math.min(minimo, tabla[i][j]);
			}
		}

		resultado[0] = maximo;
		resultado[1] = minimo;

		return resultado;
	}

}
