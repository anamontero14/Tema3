package boletinclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pida al usuario dos valores, tamaño y valor, y luego
		 * cree un array del tamaño dado y que almacene valor en todas sus posiciones.
		 * Luego muestra el array por pantalla
		 */

		// variable que almacenará el valor 1
		int tamaño;
		int valor;

		// creacion de tabla
		int tabla[];

		// Scanner crear
		Scanner leer = new Scanner(System.in);

		// pedir al usuario el valor del tamaño
		System.out.print("Introduzca un tamaño para crear una tabla: ");

		// almaceno el tamaño en la variable
		tamaño = leer.nextInt();

		// crear tabla del tamaño introducido
		tabla = new int[tamaño];

		// le pido el valor que se introducirá en las tablas
		System.out.print("Introduzca el valor a rellenar la tabla: ");

		// leer el valor y meterlo en la variable
		valor = leer.nextInt();

		// inicializa la tabla en el valor introducido
		Arrays.fill(tabla, valor);

		// mostrar la tabla
		System.out.println(Arrays.toString(tabla));

		// cerrar Scanner
		leer.close();

	}

}
