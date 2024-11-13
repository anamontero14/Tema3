package boletinbidimensionales;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		/*
		 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
		 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
		 * notas por teclado y luego el programa mostrará la tabla con las notas. A
		 * continuación, mostrará la nota mínima, máxima y media de cada alumno.
		 */

		/*
		 * Variable para indicar el número de alumno del que se está introduciendo la
		 * nota en cada momento
		 */
		int numAlumno = 1;

		// creación del array
		double notasAlumnos[][] = new double[4][5];

		// variable para ir almacenando la nota introducida por la entrada
		double nota;

		// variable para la nota mínima
		double minima = Double.MAX_VALUE;

		// variable para la nota maxima
		double maxima = Double.MIN_VALUE;

		// variable para realizar la suma
		double suma = 0;

		// variable para la nota media
		double media = 0;

		// inicializacion del Scanner
		Scanner leer = new Scanner(System.in);

		// bucle para poder ir introduciendo las notas de los alumnos (filas)
		for (int i = 0; i < 4; i++) {
			System.out.println("Introduzca las 5 notas del Alumno " + numAlumno);
			// bucle interno para las columnas
			for (int j = 0; j < 5; j++) {

				System.out.print("Nota: ");

				// asigno el valor introducido a la variable
				nota = leer.nextDouble();

				// asigno el valor de la variable a la posición de la tabla
				notasAlumnos[i][j] = nota;

			}
			System.out.println();
			// incremento el número del alumno
			numAlumno++;
		}

		numAlumno = 1;

		System.out.println("Las notas de cada alumno son: ");
		System.out.println();

		for (int i = 0; i < 4; i++) {
			System.out.print("Notas del alumno " + numAlumno + " : ");
			// bucle interno para las columnas
			for (int j = 0; j < 5; j++) {
				// muestro las notas de los alumnos 1 por 1
				System.out.print(notasAlumnos[i][j] + "\t");

				// voy sumando los valores
				suma += notasAlumnos[i][j];

				// averiguo las notas minimas y máximas de los alumnos por fila y las recojo en
				// las variables correspondientes
				minima = Math.min(minima, notasAlumnos[i][j]);
				maxima = Math.max(maxima, notasAlumnos[i][j]);
			}
			// hago la media de las notas
			media = suma / 5;

			// pongo la suma otra vez a 0
			suma = 0;

			// muestro las notas mínimas y máximas
			System.out.println();
			System.out.println("Nota mínima de alumno " + numAlumno + " : " + minima);
			System.out.println("Nota máxima de alumno " + numAlumno + " : " + maxima);
			System.out.println("La nota media del alumno " + numAlumno + " es: " + media);
			System.out.println();

			// igualo las variables otra vez a los números maximos y mínimos para que si un
			// alumno tiene por ejemplo un 2,4 que esa nota no sea la nota mínima para todos
			// los alumnos sino solo para ese alumno
			minima = Double.MAX_VALUE;
			maxima = Double.MIN_NORMAL;

			// incremento el número del alumno
			numAlumno++;
		}

		// cerrar scanner
		leer.close();

	}

}
