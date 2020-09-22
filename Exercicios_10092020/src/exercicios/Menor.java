package exercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Menor {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de entradas que você fará.");
		int numComandos = entrada.nextInt();
		
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		for (int i = 0; i < numComandos; i++) {
			System.out.println("Digite um valor numérico.");
			valores.add(entrada.nextInt());
		}
		
		
		Collections.sort(valores);
		
		int menor = valores.get(0);
		
		System.out.println("Menor valor digitado: " + menor);
	}

}
