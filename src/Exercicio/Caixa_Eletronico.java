package Exercicio;

import java.util.Scanner;

public class Caixa_Eletronico {
	
	Scanner s = new Scanner(System.in);
	
	
	private int uninotas;
	private int valor;
	
	public int getUninotas() {
		return uninotas;
	}
	public void setUninotas(int uninotas) {
		this.uninotas = uninotas;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
	public void metodo ()  {
		
	 // variavel unidade de quantas notass

		System.out.println("Escreva o Valor do Saque:");

		 valor = s.nextInt(); // recebe o valor do usuario

		int vetor[] = new int[7]; // meu vetor que armazena minhas notas

		vetor[0] = 200;
		vetor[1] = 100;
		vetor[2] = 50;
		vetor[3] = 20;
		vetor[4] = 10;
		vetor[5] = 5;
		vetor[6] = 2;

		System.out.println("veja as opções");

		for (int i = 1; i < vetor.length; i++) { // laço de repetição que o tamanho é o tamanho do vetor

			if (valor >= vetor[i]) { // a condição é se o valor for maior que o vetor minha cédula.

				uninotas = valor / vetor[i]; // valor divido por a nota mais proxima da entrada.

				System.out.println("Saque " + uninotas + " nota de " + vetor[i]); // printo o valor das quantidades das
																					// notas que precisara ser utilizado
																					// e também informa quais sao as
																					// notas

			}

		}

		
		
		
	}
	
	
	
	
	
	
	
	
	
	}
