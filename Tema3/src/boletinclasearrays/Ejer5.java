package boletinclasearrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores
		 * enteros aleatorios entre 0 y 99. Luego pedirá por teclado un valor y se
		 * mostrará por pantalla si ese valor existe en el array, además de cuántas
		 * veces.
		 */

		// DECLARACIÓN DE VARIABLES
		// creación del array
		int tabla[] = new int[1000];

		// creación de la clase random
		Random rand = new Random();

		// variable para contar en cuántas posiciones está el número
		int contador = 0;

		// índice de búsqueda que irá incrementando
		int existe = 0;

		// creación de la variable que almacenará el random
		int numRand;

		// creación de la variable para almacenar la respuesta del usuario
		int num;

		// creación del Scanner
		Scanner leer = new Scanner(System.in);

		// asignación de los números random a la tabla
		for (int i = 0; i < 1000; i++) {
			// a numRand le asigno un nº random en cada iteración
			numRand = rand.nextInt(0, 100);
			// en cada iteración le asigno el valor de rand a la posición de la tabla
			tabla[i] = numRand;
		}

		// le pido al usuario un número a buscar
		System.out.print("Introduzca el número del que desea saber si existe en el array: ");

		// recojo la respuesta en la variable
		num = leer.nextInt();

		// ordeno la tabla
		Arrays.sort(tabla);

		// buscar el número
		existe = Arrays.binarySearch(tabla, num);

		// si en existe hay más de un 0 entonces
		if (existe > 0) {
			// busca en toda la tabla
			for (int valor : tabla) {
				// y si el número es igual al valor
				if (num == valor) {
					// entonces incrementa el contador
					contador++;
				}
			}
			// muestra el mensaje
			System.out.println("El número existe en la tabla y está en " + contador + " posiciones.");
		} else {
			// si en existe hay un 0 significa que no ha encontrado el número
			System.out.println("El número no existe en la tabla.");
		}

		// cerrar el Scanner
		leer.close();

	}

}
