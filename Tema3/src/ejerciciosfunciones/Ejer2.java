package ejerciciosfunciones;

public class Ejer2 {

	public static void main(String[] args) {
		/*
		 * Diseñar la función: int maximo(int t[]), que devuelva el máximo valor
		 * contenido en la tabla t.
		 */

		// creación de la tabla
		int t[] = { 1, 6, -3, 99, 8 };

		// imprimo el return de la funcion
		System.out.println(maximo(t));

	}

	// creación de la función
	static int maximo(int t[]) {

		// creo la variable para almacenar el número máximo
		int maximo = Integer.MIN_VALUE;

		// creo un bulce para poder ir comparando y averiguando el
		for (int i = 0; i < t.length; i++) {
			// recorro la tabla y voy averiguando el numero maximo
			maximo = Math.max(maximo, t[i]);
		}

		return maximo;
	}

}
