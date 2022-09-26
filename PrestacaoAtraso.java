/*
** Programa: PrestacaAtraso / Atividade 8
** Autor: Cledson Barreto Araújo
** Data: 23/09/2022
** Observações: Programa JAVA para calcular o valor de uma prestação em atraso
*/

import java.util.Scanner;

public class PrestacaoAtraso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double valor;
		double taxa;
		double tempo;
		
		
		System.out.println("Digite o valor da prestação: " );
		valor = entrada.nextDouble();
		System.out.println("Digite a taxa de juros: " );
		taxa = entrada.nextDouble();
		System.out.println("Digite quantos meses está em atraso: " );
		tempo = entrada.nextDouble();
		
		double prestacao = valor + (valor * (taxa/100) * tempo);
		System.out.printf("O valor da prestação em atraso é: R$ " + prestacao);
		
		entrada.close();

	}

}