package ejerciciosfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		/*
		 * Implementa la función: int[] suma(int t[], int numElementos), que crea y
		 * devuelve una tabla con las sumas de los numElementos elementos consecutivos
		 * de t. Veamos un ejemplo, sea t=[10, 1, 5, 8, 9, 2]. Si los elementos de t se
		 * agrupan de 3 en 3, se harán las sumas: 10+1+5=16 1+5+8=14 5+8+9=22 8+9+2=19
		 * Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22,
		 * 19]
		 */

		// variable para almacenar las sumas
		int sumar = 0;

		int contador = 0;

		// creacion de tabla
		int tabla[] = { 10, 1, 5, 8, 9, 2 };

		// creacion de la tabla de los resultados
		int resultados[] = new int[10];

		// creo el Scanner
		Scanner leer = new Scanner(System.in);

		// variable para almacenar la respuesta del usuario
		int agrupar = respuestas("Introduce el número por el que quieres ir sumando: ");

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < agrupar; j++) {
				sumar += tabla[contador];

				if (contador < tabla.length) {
					contador++;
				}
			}

			if (contador >= tabla.length) {
				break;
			}

			contador--;
			resultados[i] = sumar;
			System.out.println(resultados[i]);
			sumar = 0;
		}

		System.out.println(Arrays.toString(resultados));

	}

	static int respuestas(String mensaje) {

		// creo el Scanner
		Scanner leer = new Scanner(System.in);

		// mensaje al usuario
		System.out.println(mensaje);

		return leer.nextInt();
	}

}
