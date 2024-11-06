package ejerciciosparte1;

public class Ejer4 {

	public static void main(String[] args) {

		/*
		 * Define un array de 12 números enteros con nombre num y asigna los valores
		 * según la tabla que se muestra a continuación. Muestra el contenido de todos
		 * los elementos del array por consola. ¿Qué sucede con los valores de los
		 * elementos que no han sido inicializados?
		 */

		// creación del array
		int num[] = new int[12];

		// la posición 0 vale 39
		num[0] = 39;
		// la posición 1 vale -2
		num[1] = -2;
		// la posición 4 vale 0...
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// recorro toda la tabla mostrando sus valores
		for (int valor : num) {
			System.out.print(valor + ", ");
		}
		
		System.out.println();
		
		System.out.println("Los valores que no han sido inicializados se muestran como 0");

	}

}
