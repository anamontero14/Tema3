package pruebas;

public class Pr3 {

	public static void main(String[] args) {
		int tabla[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i][0] + " ");
		}
	}

}
