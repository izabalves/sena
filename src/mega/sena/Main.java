package mega.sena;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int opt = -1;
		Scanner entrada = new Scanner(System.in);

		while (opt != 9) {
			// menu

			System.out.println("\n------------------------------------------");
			System.out.println("Escolha uma opção: ");
			System.out.println("1. Sortear 3000 ");
			System.out.println("2. Quantida de vezes que o numero foi sorteado");
			System.out.println("3. 15 duplas que mais sairam");
			System.out.println("4. 15 números que mais sairam");
			System.out.println("5. Listar números por jogada");
			System.out.println("6. Simular jogadas");
			System.out.println("9. Sair: ");

			// opção digitada é válida
			try {
				opt = entrada.nextInt();
			} catch (Exception e) {
				System.out.println("Digite apenas números!");
			}

			// escolhe o que fazer
			switch (opt) {
			case 1:
				MegaSena mega = new MegaSena();
				mega.sortear3000();
				break;

			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Izabela programe essa funcionalidade");
				break;

			case 6:
				Simulador simulador = new Simulador();
				simulador.simularTresJogadores();
				break;

			case 9:
				System.out.println("Bye bye");
			}

		}

	}

}