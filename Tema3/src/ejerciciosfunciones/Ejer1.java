package ejerciciosfunciones;

public class Ejer1 {

	public static void main(String[] args) {
		/*
		 * Realiza una función que reciba como parámetro una tabla de enteros y devuelva
		 * la suma de todos los valores almacenados en la tabla. Prueba el
		 * comportamiento de la función en un método main.
		 */

		// creación de tabla
		int[] tabla = { 2, 2 };

		System.out.print("El resultado de la suma de los valores de la tabla es: " + sumaValores(tabla));

	}

	// llamada a la funcion
	static int sumaValores(int tabla[]) {
		// inicializo la variable suma
		int suma = 0;

		for (int valores : tabla) {
			suma += valores;
		}

		// establezco que me devuelva el resultado en la variable suma
		return suma;

	}

}
