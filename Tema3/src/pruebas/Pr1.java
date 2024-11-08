package pruebas;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.Box.Filler;

public class Pr1 {

	public static void main(String[] args) {

		/* Explicación to.String */

		// creo la tabla
		int[] tabla1 = { 1, 2, 3, 4, 5 };
		int[] tabla2 = { 1, 2, 3, 4, 5 };
		int[] tabla3 = { 5, 4, 3, 2, 1 };

		// muestro la tabla
		System.out.println(Arrays.toString(tabla1));

		// lo que pasa si intentas mostrar un solo valor con toString
		System.out.println("System.out.println(Arrays.toString(tabla[1]));");
		System.out.println("Esto no se puede poner");

		/* Explicación equals */
		System.out.println();
		System.out.println("Para comparar dos tablas. Va a mostrar un valor booleano.");
		System.out.println("Dos tablas que son iguales: " + Arrays.equals(tabla1, tabla2));
		System.out.println("Dos tablas que son diferentes: " + Arrays.equals(tabla1, tabla3));

		/* Explicación fill */
		// creo tabla nueva
		int tabla4[] = new int[5];
		// inicializo todos los valores a 10
		Arrays.fill(tabla4, 10);

		System.out.println("La tabla de 5 celdas de espacio (0-4) está inicializada toda a 10: ");
		System.out.println(Arrays.toString(tabla4));

		System.out.println();

		// creo otra tabla
		int tabla5[] = new int[5];
		// inicializo todos los valores de tabla5 desde el 0 hasta el 3 a 10
		Arrays.fill(tabla5, 0, 3, 10);

		System.out.println("La tabla de 5 celdas tiene inicializado a 10 los espacios desde 0 hasta 3:");
		System.out.println(Arrays.toString(tabla5));

		System.out.println();

		/* Explicación de sort */
		// ordena de forma ascendiente
		int[] tabla6 = { 10, 5, 6, 2, 1, 7, 8, 9, 3, 4 };

		// lo muestro desordenado
		System.out.println("Orden original: " + Arrays.toString(tabla6));

		// lo ordena
		Arrays.sort(tabla6);

		// lo muestro
		System.out.println(Arrays.toString(tabla6));

	}

}
