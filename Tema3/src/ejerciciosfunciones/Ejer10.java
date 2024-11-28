package ejerciciosfunciones;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		/*
		 * Implementa la siguiente función: boolean esMagica(int tabla[][]), que recibe
		 * una tabla bidimensional. La función devolverá true si la matriz introducida
		 * corresponde a una matriz mágica, que es aquella donde la suma de los
		 * elementos de cualquier fila o de cualquier columna valen lo mismo. En caso
		 * contrario devolverá false.
		 */

		// creacion de Scanner
		Scanner leer = new Scanner(System.in);

		// variable para almaceanr los números del usuario
		int num;

		// variable para almacenar la longitud de la tabla
		int filas;

		// variable para almacenar las columans de la tabla
		int colum;

		// creo la tabla bidimensional
		int tabla[][];

		// pregunto al usuario el numero de filas
		System.out.print("Introduzca el número de filas que quiere que tenga su matriz: ");
		filas = leer.nextInt();

		// pregunto al usuario el numero de columnas
		System.out.print("Introduzca el número de columnas que quiere que tenga su matriz: ");
		colum = leer.nextInt();

		// le asigno la longitud a la tabla
		tabla = new int[filas][colum];

		// recojo los números del usuario
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.print("Introduzca un número para la matriz: ");
				num = leer.nextInt();

				// le asigno el dato a la posicion correspondiente
				tabla[i][j] = num;	
			}
		}

		// creo la variable para almacenar el return de la funcion
		boolean funcion = esMagica(tabla);

		System.out.println(funcion);

		// cierre de Scanner
		leer.close();
	}

	static boolean esMagica(int tabla[][]) {
		// variable para indicar si es magica o no
		boolean magica = true;

		// tabla nueva para almacenar la anterior
		int tablaAlmacenada[][] = tabla;

		// variable para almacenar la suma de las filas
		int sumaFilas = 0;

		// variable para almacenar la suma de las columnas
		int sumaCol = 0;

		// si la tabla es cuadrada haz esto
		if (tablaAlmacenada.length == tablaAlmacenada[0].length) {

			// bucle para sumar las filas
			for (int i = 0; i < tablaAlmacenada.length; i++) {
				// recorrer las columnas
				for (int j = 0; j < tablaAlmacenada[0].length; j++) {
					sumaFilas += tablaAlmacenada[i][j];
					sumaCol += tablaAlmacenada[j][i];

				}
				// si la suma de las columnas no es igual a la suma de las filas entonces false
				if (sumaCol != sumaFilas) {
					magica = false;
				}

				sumaCol = 0;
				sumaFilas = 0;
			}
		} else {
			magica = false;
		}

		return magica;
	}

}
