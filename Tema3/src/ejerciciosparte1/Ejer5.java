package ejerciciosparte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pida diez números reales por teclado, los almacene en un
		 * array, y luego lo recorra para calcular la suma de todos los números y,
		 * además, averiguar el máximo y mínimo y mostrarlos por pantalla
		 */

		// creación de la variable para almacenar los números
		double num;

		// variable para la suma
		double suma = 0;

		// creación del Scanner
		Scanner leer = new Scanner(System.in);

		// crear tabla
		double tabla[] = new double[10];

		// variable para almacenar el mínimo
		double min = Double.MAX_VALUE;

		// variable para almacenar el máximo
		double max = Double.MIN_VALUE;
		;

		// recoger los valores en la tabla
		for (int i = 0; i < tabla.length; i++) {

			// pedirle al usuario los valores
			System.out.print("Introduzca un número: ");

			// almacenar el número en la variable
			num = leer.nextDouble();

			// almacenarlo en la tabla
			tabla[i] = num;

		}

		// recorro la tabla y voy sumando a la variable suma los valores en cada
		// iteracion
		for (double valor : tabla) {
			suma += valor;

			// hayar el mínimo de la tabla
			min = Math.min(min, valor);

			// hayar el máximo de la tabla
			max = Math.max(max, valor);
		}

		// mostrar la suma
		System.out.println("La suma de la tabla es: " + suma);

		// mostrar el número mayor y menor
		System.out.println("El número mayor es " + max + " y el número menor es " + min);

		// cerrar Scanenr
		leer.close();

	}

}
