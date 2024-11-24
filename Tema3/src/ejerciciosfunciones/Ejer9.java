package ejerciciosfunciones;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {

		/*
		 * Define una función que reciba una tabla bidimensional y devuelva un booleano
		 * para indicar si la matriz es o no simétrica. Una matriz se dice que es
		 * simétrica si A[i][j] = A[j][i] para todo i, j dentro de los límites de la
		 * matriz. Delfine un método main que llame a la función y muestre por pantalla
		 * el resultado, indicando si la tabla pasada por parámetro es simétrica o no
		 */

		// creo el scanner
		Scanner leer = new Scanner(System.in);

		// creo una variable para recoger las filas de la tabla
		int filas;

		// creo una variable para recoger las columnas de la tabla
		int colum;

		// creo una variable para almacenar los número introducidos por el usuairo
		int num;

		// creación de tabla bidimensional
		int tabla[][];

		// pregunto por la cantidad de filas
		System.out.print("Introduzca la cantidad de filas que quiere que tenga la matriz: ");
		filas = leer.nextInt();

		// pregunto por la cantidad de filas
		System.out.print("Introduzca la cantidad de columnas que quiere que tenga la matriz: ");
		colum = leer.nextInt();

		// le doy la longitud a la tabla
		tabla = new int[filas][colum];

		// creo un bucle para preguntar por los valores de la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.print("Introduzca los valores para la matriz: ");
				num = leer.nextInt();
				// voy asignando los números introducidos
				tabla[i][j] = num;
			}
		}

		// creo una variable para almacenar la llamada a la funcion
		boolean funcion = simetria(tabla);

		// muestro la función
		System.out.println(funcion);

		// cierro el Scanner
		leer.close();

	}

	static boolean simetria(int[][] tabla) {

		// almaceno la tabla en otra
		int tablaAlmacenada[][] = tabla;

		// variable para indicar si la tabla es simetrica o no
		boolean simetrica = true;

		// si la matriz no es cuadrada
		if (tablaAlmacenada.length != tablaAlmacenada[0].length) {
			simetrica = false;
		} else {

			// recorro las filas
			for (int i = 0; i < tablaAlmacenada.length; i++) {
				// recorro las columnas
				for (int j = 0; j < tablaAlmacenada[0].length; j++) {
					// si las celdas no son iguales iguala la variable a false
					if (tablaAlmacenada[i][j] != tablaAlmacenada[j][i]) {
						simetrica = false;
					}
				}
			}
		}
		
		return simetrica;
	}

}
