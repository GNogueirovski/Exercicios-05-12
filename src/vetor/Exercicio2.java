package vetor;

import java.util.Scanner;

public class Exercicio2 {
	// SOMA DOS ELEMENTOS
	// MÉDIA DOS ELEMENTOS
	// ELEMENTOS DO VETOR QUE SÃO PARES
	// ELEMENTOS NOS INDICES IMPARES
	public static void main(String[] args) {
		int numero[] = new int[10];
		float media = 0, soma = 0;
		Scanner leia = new Scanner(System.in);
		// soma elementos
		for (int indice = 0; indice < numero.length; indice++) {
			System.out.printf("Digite o %dº número do vetor :", indice + 1);
			numero[indice] = leia.nextInt();
			soma = soma + numero[indice];
		}
		// media elementos
		media = soma / 10;

		System.out.println("\nElementos nos indices impares");
		for (int indice = 0; indice < numero.length; indice++) {
			if (indice % 2 == 1) {
				System.out.printf("%d / ", numero[indice]);
			}
		}

		// elementos DO VETOR QUE SÃO PARES
		System.out.println("\nElementos pares:");
		for (int indice = 0; indice < numero.length; indice++) {
			if (numero[indice] % 2 == 0) {
				System.out.printf("%d / ", numero[indice]);

			}

		}
		System.out.printf("\nSoma: %.1f\n", soma);
		System.out.printf("\nMédia: %.2f", media);

		leia.close();

	}
}
