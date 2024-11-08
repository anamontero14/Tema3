package boletinclasearrays;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		/*
		 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
		 * torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
		 * puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800,
		 * de tipo entero) y luego muestre las puntuaciones en orden descendente (de la
		 * más alta a la más baja)
		 */

		// variable para almacenar las puntuaciones introducidas
		int puntuaciones;

		// creacion de la tabla
		int tabla[] = new int[8];

		// creacion de Scanner
		Scanner leer = new Scanner(System.in);

		// for para pedirle al usuario
		for (int i = 1; i <= 8; i++) {

			// pedirle las puntuaciones al usuario
			System.out.print("Introduzca las puntuaciones de los participantes: ");

			// almacenar las puntuaciones en la variable
			puntuaciones = leer.nextInt();
		}

		// cerrar Scanner
		leer.close();
	}

}
