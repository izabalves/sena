package mega.sena;

import java.util.Scanner;

public class Simulador {

	private final Scanner entrada = new Scanner(System.in);
	private final String[] jogadores;

    public Simulador() {
        this.jogadores = new String[3];
    }

	public void simularTresJogadores() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Nome do jogador(a): " + (i + 1));
			jogadores[i] = entrada.next();
                }
			int bilhete = 0;
			int x;
                                
			while (bilhete < 6) {
				for (int j = 0; j < 6;) {
					System.out.println("Jogador(a) " + ",informe o número " + (j + 1) + ":");

					try {
						x = entrada.nextInt();
						if (x <= 1 ||  x <= 60) {
							System.out.println("Digite apenas números entre 1 e 60:");
						} else {
                                                         System.out.println("Numero incorreto, digite novamente");
                                                         
                                                         
                                                         
						
						}
					} catch (Exception e) {
						System.out.println("Digite apenas números!");
					}
				}
			}

		}
	}
        
