package boletinbidimensionales;

public class Ejer4 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que cree una tabla de 10x10 que contenga los valores de
		 * las tablas de multiplicar del 1 al 10 (cada tabla de multiplicar en una
		 * fila). Muestra la tabla por pantalla
		 */

		int numTabla = 1;
		int numMulti = 1;

		// creo la tabla
		int tabla[][] = new int[10][10];

		// creo un bucle for para ir rellenando la tabla
		for (int i = 0; i < tabla.length; i++) {
			// creo un bucle interno para ir rellenando las columnas
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = numTabla * numMulti;
				numMulti++;
			}
			numMulti = 1;
			numTabla++;
		}

		// muestro la tabla
		for (int k = 0; k < tabla.length; k++) {
			// bucle interno para mostrar las columnas
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[k][j] + "\t");
			}
			System.out.println();
		}

	}

}
