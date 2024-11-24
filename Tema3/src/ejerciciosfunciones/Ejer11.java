package ejerciciosfunciones;

public class Ejer11 {

	public static void main(String[] args) {

		/*
		 * Realizar una función: int[][] gira90(int tablaInicio[][]), que dada una
		 * matriz de NxN (mismo número de filas y columnas), devuelve la tablaInicio
		 * girada 90º
		 */

		// creo la tabla inicial
		int tabla[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// variable para almacenar la funcion
		int funcion[][] = gira90(tabla);

		System.out.println("Tabla inicial");
		for (int fila[] : tabla) {
			for (int col : fila) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		System.out.println("\nTabla girada");
		for (int fila[] : funcion) {
			for (int col : fila) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	static int[][] gira90(int tablaInicio[][]) {

		// creacion de la tabla girada
		int tablaGirada[][] = new int[tablaInicio.length][tablaInicio[0].length];

		for (int i = 0; i < tablaGirada.length; i++) {
			for (int j = 0; j < tablaGirada[0].length; j++) {
				tablaGirada[j][tablaGirada.length - 1 - i] = tablaInicio[i][j];
			}
		}

		return tablaGirada;
	}

}
