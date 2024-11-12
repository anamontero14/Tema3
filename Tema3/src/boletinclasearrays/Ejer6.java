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

		int contador = 0;

		int busqueda;

		// bucle para ir poniendo los números en la tabla
		while (contador < 6) {
			// creo el número random y lo asigno a la variable
			numRandom = random.nextInt(1, 50);
			// ordena la tabla de menor a mayor
			Arrays.sort(tabla1);
			/*
			 * busca si en tabla1 se encuentra el número random generado, si NO se encuentra
			 * igualará 'busqueda' a un número negativo y si SÍ se encuentra
			 */
			busqueda = Arrays.binarySearch(tabla1, numRandom);
			/*
			 * si 'busqueda' tiene un valor negativo (si 'busqueda' es menor que 0) entrará
			 * en el if
			 */
			if (busqueda < 0) {
				/*
				 * Como la tabla va a estar ordenada podemos igualar siempre a la posicion 0 el
				 * número random porque ya que va a estar ordenada de menor a mayor pues los
				 * números siempre van a estar a la derecha y el 0 a la izquierda
				 */
				tabla1[0] = numRandom;
				/*
				 * incrementa el contador para que siga buscando en las diferentes posiciones de
				 * la tabla
				 */
				contador++;
			}
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
