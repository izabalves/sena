package mega.sena;

import java.util.Scanner;

public class Simulador {

	private final Scanner entrada = new Scanner(System.in);
	private final String[] jogadores = new String[3];

	public void simularTresJogadores() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Nome do jogador(a): " + (i + 1));
			jogadores[i] = entrada.next();

			int bilhete = 0;
			int numeros = 0;
			while (bilhete < 6) {
				for (int j = 0; j < 6;) {
					System.out.println("Jogador(a) " + ",informe o número " + (j + 1) + ":");

					try {
						numeros = entrada.nextInt();
						if (numeros < 1 || numeros > 60) {
							System.out.println("Digite apenas números entre 1 e 60:");
						} else {
							j++;
							bilhete++;
						}
					} catch (Exception e) {
						System.out.println("Digite apenas números!");
					}
				}
			}

		}
	}
        
}