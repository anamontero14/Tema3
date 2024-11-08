package boletinclasearrays;
import java.util.Arrays;
import java.util.Random;

public class Ejer3 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
		 * aleatorios entre 0 y 9. Luego ordena los valores del array y los mostrará por
		 * pantalla
		 */

		// creacion de la tabla
		int tabla[] = new int[30];

		// variable en donde se almacenarán los números random
		int numRand;

		// creación de los valores random
		Random rand = new Random();

		// crear 30 números aleatorios
		for (int i = 1; i < 30; i++) {
			// almaceno los núemros random en numRand
			numRand = rand.nextInt(0, 10);

			// almaceno dicho número en la tabla
			tabla[i] = numRand;
		}

		// ordenar la tabla
		Arrays.sort(tabla);

		// mostrarlo
		System.out.println(Arrays.toString(tabla));

	}

}
