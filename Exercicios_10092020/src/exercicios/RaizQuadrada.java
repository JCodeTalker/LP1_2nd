package exercicios;

import java.util.Scanner;

public class RaizQuadrada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número para obtenção de sua raiz quadrada.");
		int quadrado = entrada.nextInt(), raizQuadrada;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (Math.pow(i, 2) == quadrado) {
				raizQuadrada = i;
				System.out.printf("A raiz quadrada de %d é: %d.",quadrado, raizQuadrada);
				break;
			}
		}
	}

}
