package exercicios; 

import java.util.ArrayList;
import java.util.Scanner;

public class Barras {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		System.out.println("Digite 5 valores entre 1 e 30.");
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			if(entrada.nextInt() <= 30) {
			valores.add(entrada.nextInt());
			}
		}

		
		for (int i : valores) {
			int valorAtual = i;
			for (int x = 0; x < valorAtual; x++) {
				System.out.print("*");
			}
			System.out.printf("%n");
		};
		
		
	}}
