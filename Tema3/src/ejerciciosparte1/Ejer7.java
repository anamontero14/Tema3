package ejerciciosparte1;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
		 * un determinado año y las almacene en una tabla (una posición por mes). A
		 * continuación, se debe mostrar un diagrama de barras horizontales con esos
		 * datos. Las barras del diagrama se pueden dibujar a base de asteriscos o
		 * cualquier otro carácter
		 */

		// variable para almacenar la temperatura introducida
		int temperatura;

		// creacion de scanner
		Scanner leer = new Scanner(System.in);

		// creacion de la tabla
		int tabla[] = new int[12];

		// for para recoger los datos
		for (int i = 0; i < 12; i++) {

			// pedirle al usuario el dato
			System.out.print("Introduzca la temperatura media del mes: ");

			// almacenar el dato en la variable temperatura
			temperatura = leer.nextInt();

			// alamacenar la variable en la tabla
			tabla[i] = temperatura;

		}

		// creación de hasta qué número llegarán las barras
		for (int i = 0; i < 12; i++) {
			// creación de la longitud de las barras
			for (int j = 1; j <= tabla[i]; j++) {
				System.out.print("-");
			}

			System.out.println();
		}

		// cerrar scanner
		leer.close();

	}

}
