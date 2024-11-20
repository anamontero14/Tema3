package ejerciciosfunciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		/*
		 * Realiza la función: int[] buscarTodos(int t[], int valor), que crea y
		 * devuelve una tabla con todos los índices de los elementos donde se encuentra
		 * el valor de búsqueda. En el caso de que el valor no se encuentre en la tabla
		 * t, la función devolverá una tabla vacía
		 */

		// creación del scanner
		Scanner leer = new Scanner(System.in);

		// crear clase random para introducir números en la tabla
		Random rand = new Random();

		// variable que almacenará el número random
		int numRand;

		// creación de la tabla
		int t[];

		// variable para recoger la longitud que el usuario introduzca
		int longitud = 0;

		// variable para recoger el valor que quiere buscar el usuario
		int valor = 0;

		// comprobacion de la respuesta
		do {
			try {
				// pregunto al usuario
				System.out.print("Introduzca la longitud que quiere que tenga la tabla: ");

				// recojo la respuesta en la variable
				longitud = leer.nextInt();

			} catch (InputMismatchException e) {
				System.err.println("Introduzca un número.");
			} finally {
				// limpiar el buffer
				leer.nextLine();
			}
		} while (longitud < 0);

		// le asigno la longitud a la tabla
		t = new int[longitud];

		// asignar valores a la tabla
		for (int i = 0; i < t.length; i++) {
			// creo numero random en cada iteracion
			numRand = rand.nextInt(0, 10);

			// se lo asigno a la tabla
			t[i] = numRand;
		}

		// comprobacion de la respuesta (valor a buscar)
		do {
			try {
				// pregunto al usuario
				System.out.println("Introduzca el valor que quiere buscar: ");

				// recojo la respuesta en la variable
				valor = leer.nextInt();
			} catch (InputMismatchException e) {
				System.err.print("Introduzca un número.");
			} finally {
				// limpiar el buffer
				leer.nextLine();
			}
		} while (valor < 0);

		// System.out.println(Arrays.toString(t));

		// muestro la tabla resultante
		System.out.println(Arrays.toString(buscarTodos(t, valor)));

		// cerrar Scanner
		leer.close();

	}

	static int[] buscarTodos(int t[], int valor) {

		// variable que almacenará los índices
		int indices[] = new int[t.length];

		// buscar en la tabla
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				indices[i] = i;
			}
		}

		return indices;
	}

}
