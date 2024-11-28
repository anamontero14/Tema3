package ejerciciosfunciones;

import java.util.InputMismatchException;
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
		int filas = leer("filas");

		// creo una variable para recoger las columnas de la tabla
		int colum = leer("columnas");

		// creo una variable para almacenar los número introducidos por el usuairo
		int num;

		// creación de tabla bidimensional
		int tabla[][];

		// le doy la longitud a la tabla
		tabla = new int[filas][colum];

		// si la tabla no es cuadrada
		if (tabla.length != tabla[0].length) {
			System.err.println("Debe introducir el mismo número de filas que de columnas");
		} else {

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
		}

		// cierro el Scanner
		leer.close();

	}

	static boolean simetria(int[][] tabla) {

		// almaceno la tabla en otra
		int tablaAlmacenada[][] = tabla;

		// variable para indicar si la tabla es simetrica o no
		boolean simetrica = true;

		// variable para poder salir
		boolean salir = false;

		int i = 0;
		int j = 0;

		while (!salir && i < tablaAlmacenada.length) {
			while (!salir && j < tablaAlmacenada[0].length) {
				if (tablaAlmacenada[i][j] != tablaAlmacenada[j][i]) {
					salir = true;
					simetrica = false;
				}
				j++;
			}
			i++;
		}

		return simetrica;
	}

	static int leer(String dato) {
		// creo el scanner
		Scanner leer = new Scanner(System.in);

		int numero = -1;

		do {
			try {
				System.out.print("Introduzca la cantidad de " + dato + " que quiere que tenga la matriz: ");
				numero = leer.nextInt();

				assert numero > 0 : "El número de " + dato + " debe ser mayor que 0";
				
			} catch (InputMismatchException e) {
				System.err.println("Debe introducir un entero");
			} catch (AssertionError a) {
				System.err.println(a.getMessage());
			}
			finally {
				leer.nextLine();
			}
		} while (numero < 0);

		return numero;
	}

}
