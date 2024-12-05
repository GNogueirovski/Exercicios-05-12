package vetor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int numero[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }, numerousuario;
		boolean encontrado = false;
		
		Scanner leia = new Scanner(System.in);
		// entrada do número para encontrar a posição dele
		System.out.println("Digite o número para encontrar sua posição:");
		numerousuario = leia.nextInt();
		
		// for com if para ver se o número que o usuario colocou está dentro do vetor, se for encontrado o boolean vira true
		for (int indice = 0; indice < numero.length; indice++) {
			if (numero[indice] == numerousuario) {
				System.out.printf("O número %d está localizado na posição %d  ", numero[indice], indice);
				encontrado = true;
				break;
			}

		}
		//if para receber se o numero foi encontrado, se nao foi printa que o numero nao foi achado
		if (!encontrado) {
			System.out.printf("O número %d não foi encontrado", numerousuario);
		}
		leia.close();
	}

}
