package ejerciciosparte1;

import java.util.Random;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
		 * valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará
		 * en qué posiciones del array aparece N
		 */

		// creación del numero aleatorio
		Random rand = new Random();

		// creacion de la variable para el valor que habrá que mostrar
		int mostrar;

		// crear la tabla
		int tabla[] = new int[100];

		// creacion del scanner
		Scanner leer = new Scanner(System.in);

		// creo el bucle
		for (int i = 0; i < 100; i++) {
			// asigno que variable almacenara el random
			int num = rand.nextInt(1, 11);

			// asigno los valores a la tabla
			tabla[i] = num;
		}

		// le digo al usuario que me introduzca el valor que quiere buscar
		System.out.print("Introduzca el valor a buscar: ");

		// almaceno la respuesta en la variable
		mostrar = leer.nextInt();

		// recorrer la tabla
		for (int valor : tabla) {

		}

		// cerrar el scanner
		leer.close();

	}

}
