package exercicios;

import java.util.Scanner;

public class Potenciacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int base, expoente, resultado;
		
		System.out.println("Digite o valor da base.");
		base = entrada.nextInt();
		resultado = base;
		
		System.out.println("Digite o valor do expoente.");
		expoente = entrada.nextInt();
		
		for(int i = 1; i < expoente; i++) {
			resultado = (resultado * base);
		}
		System.out.println("Resultado: " + resultado);
	}

}
