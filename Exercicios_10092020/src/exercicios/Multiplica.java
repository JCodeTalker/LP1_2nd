package exercicios;

import java.util.Scanner;

public class Multiplica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número");
		int termo1 = entrada.nextInt();

		System.out.println("Digite o segundo número");
		int termo2 = entrada.nextInt();

		System.out.println("Digite o terceiro número");
		int termo3 = entrada.nextInt();

		int produto = termo1 * termo2 * termo3;

		System.out.printf("O produto dos 3 números digitados é: %d.", (produto));
	}

}
