package br.senai.br.jandira;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		
		double juros, capital, taxa, tempo;
		Scanner leitor;
		
		leitor = new Scanner(System.in);
		
		System.out.print("Qual é o capital? ");
		capital = leitor.nextDouble();
				
		System.out.print("Qual é a taxa de juros? ");
		taxa = leitor.nextDouble();
		
		System.out.print("Qual o tempo? ");
		tempo = leitor.nextDouble();
		
		juros = capital* taxa/100 *tempo; //J-C.i.t
		
		System.out.println ("O valor do juros é?" +juros);
		
		
		System.out.printf ("Ao final do período você terá %s" , juros + capital);
		
	}
	
}
		
		
