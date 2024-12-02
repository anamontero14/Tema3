package pruebas;

import java.util.Random;
import java.util.Scanner;

public class Pr1 {

	static final int BOARD_SIZE = 20; // Tamaño del tablero (20 casillas)
	static final int NUM_PLAYERS = 4; // Número de jugadores

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int[] positions = new int[NUM_PLAYERS]; // Posiciones de los jugadores
		boolean[] hasExited = new boolean[NUM_PLAYERS]; // Jugadores que ya han ganado
		boolean gameOver = false;
		int winner = -1;

		// Inicializar posiciones
		for (int i = 0; i < NUM_PLAYERS; i++) {
			positions[i] = 0; // Todos comienzan en la casilla inicial
		}

		System.out.println("¡Bienvenidos al Parchís!");
		System.out.println("El tablero tiene " + BOARD_SIZE + " casillas.");
		System.out.println("El primer jugador en llegar al final gana.");

		while (!gameOver) {
			for (int player = 0; player < NUM_PLAYERS; player++) {
				if (hasExited[player])
					continue; // Saltar si el jugador ya ganó

				System.out.println("\nTurno del jugador " + (player + 1) + ".");
				System.out.print("Presiona Enter para lanzar el dado...");
				scanner.nextLine();

				int diceRoll = random.nextInt(6) + 1; // Lanzar dado (1-6)
				System.out.println("Sacaste un " + diceRoll + ".");

				int newPosition = positions[player] + diceRoll;

				// Verificar si gana
				if (newPosition >= BOARD_SIZE) {
					System.out.println("¡Jugador " + (player + 1) + " ha llegado al final y gana el juego!");
					hasExited[player] = true;
					gameOver = true;
					winner = player;
					break;
				}

				// Movimiento normal
				positions[player] = newPosition;
				System.out.println("Jugador " + (player + 1) + " está ahora en la casilla " + positions[player] + ".");

				// Verificar colisiones con otros jugadores
				for (int otherPlayer = 0; otherPlayer < NUM_PLAYERS; otherPlayer++) {
					if (otherPlayer != player && positions[player] == positions[otherPlayer]) {
						System.out.println("¡Jugador " + (player + 1) + " manda al jugador " + (otherPlayer + 1)
								+ " a la salida!");
						positions[otherPlayer] = 0; // Reiniciar posición
					}
				}
			}
		}

		System.out.println("\n¡Felicidades al jugador " + (winner + 1) + " por ganar!");
		scanner.close();
	}
}
