package Aula01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um Valor: ");  
		System.out.println(); 
		
		int valor = entrada.nextInt(); 
		
		System.out.println(valor % 2 == 0? "É PAR!": "É IMPAR!"); 
	}

}
