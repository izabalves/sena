package mega.sena;

import java.util.Random;

public class MegaSena {

	private final int m[][] = new int[3000][6];
	private final int v[] = new int[65];
	private final Random gerador = new Random();

	public void sortear() {

	}

	public void sortear3000() {
		// faz o sorteio de 6 digitos e acrescenta a matriz
		for (int i = 0; i < 3000; i++) {
			for (int j = 1; j <= 60; j++)
				v[j] = 0;
			int j = 0;
			while (j < 6) {
				int aux = gerador.nextInt(60) + 1;
				if (v[aux] == 0) {
					m[i][j++] = aux;
					v[aux] = 1;
				}
			}
		}

		// percorre a matriz e ordena os digitos de cada sorteio
		for (int k = 0; k < 3000; k++) {
			for (int i = 0; i < 6; i++) {
				for (int j = i; j > 0; j--) {
					if (m[k][j] < m[k][j - 1]) {
						int aux = m[k][j];
						m[k][j] = m[k][j - 1];
						m[k][j - 1] = aux;
					} else
						break;
				}
			}
		}

		// forma elegante de exibir os 3000 sorteios
		for (int i = 0; i < 3000; i++) {
			System.out.println("Sorteio [" + (i + 1) + "]: " + m[i][0] + " " + m[i][1] + " " + m[i][2] + " " + m[i][3]
					+ " " + m[i][4] + " " + m[i][5]);
		}

	}

}