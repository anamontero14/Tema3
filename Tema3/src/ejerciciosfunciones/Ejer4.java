package ejerciciosfunciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		/*
		 * Escribe la función: int buscar(int t[], int clave), que busca de forma
		 * secuencial en la tabla t el valor clave. En caso de encontrarlo, devuelve en
		 * qué posición lo encuentra; y en caso contrario, devolverá -1
		 */

		// creo una variable para almacenar el número random
		int numRand;

		// creo la variable donde almacenaré el valor a buscar
		int valor;

		// creo la tabla
		int t[] = new int[10];

		// Creo el Scanner
		Scanner leer = new Scanner(System.in);

		// creo la clase random
		Random rand = new Random();

		// for para recorrer la tabla y asignarle números random
		for (int i = 0; i < t.length; i++) {
			numRand = rand.nextInt(0, 11);
			t[i] = numRand;
		}

		// pregunto el valor a buscar
		System.out.println("¿Qué valor quiere buscar en la tabla?");
		valor = leer.nextInt();
		
		System.out.println(buscar(t, valor));
		
		System.out.println(Arrays.toString(t));

		// cierro scanner
		leer.close();

	}

	static int buscar(int t[], int valor) {

		int busqueda;

		// ordeno la tabla y busco dentro de ella
		Arrays.sort(t);
		
		busqueda = Arrays.binarySearch(t, valor);

		if (busqueda < -1) {
			busqueda = -1;
		}

		return busqueda;
	}

}
