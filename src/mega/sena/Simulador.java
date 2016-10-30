package mega.sena;

import java.util.Scanner;

public class Simulador {

	private final Scanner entrada = new Scanner(System.in);

	public void simularTresJogadores() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Nome do jogador: " + i);
			System.out.println();
			entrada.next();
		}

	}

}