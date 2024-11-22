package ejerciciosfunciones;

public class Ejer8 {

	public static void main(String[] args) {

		/*
		 * Realiza una función que reciba una tabla bidimensional y devuelva en otro
		 * array distinto su transposición. Define un método main que llame a esta
		 * función pasándole una tabla bidimensional y muestre por pantalla el
		 * resultado.
		 */

		// creacion de la tabla bidimensional
		int tabla[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		// creo la variable que recogerá la función
		int transformada[][] = transformacionArray(tabla);

		// recorro las filas
		for (int fila[] : tabla) {
			// recorro las columnas
			for (int colum : fila) {
				System.out.print(colum + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Transformada: ");
		System.out.println();

		// recorro las filas
		for (int fila[] : transformada) {
			// recorro las columnas
			for (int colum : fila) {
				System.out.print(colum + " ");
			}
			System.out.println();
		}

	}

	static int[][] transformacionArray(int tabla[][]) {

		// array a devolver
		int transformacion[][] = new int[tabla[0].length][tabla.length];

		// creo un for para recorrer la tabla
		for (int i = 0; i < transformacion.length; i++) {
			// recorro las columnas
			for (int j = 0; j < transformacion[0].length; j++) {
				transformacion[i][j] = tabla[j][i];
			}
		}

		return transformacion;
	}

}
