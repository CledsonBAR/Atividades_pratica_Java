/*
** Programa: ProgressaoAritmetica / Atividade 10
** Autor: Cledson Barreto Araújo
** Data: 23/09/2022
** Observações: Programa JAVA para ler a Progressão Aritmétca do valor informado
*/

import java.util.Scanner;

public class ProgressaoAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a1, r, n, an;
		
		System.out.println("Digite o valor do primeiro termo (a1): ");
		a1 = input.nextDouble();
		
		System.out.println("Digite a razão da P.A.: ");
		r = input.nextDouble();
		
		System.out.println("Digite o valor de N(ésimo - an): ");
		n = input.nextDouble();
		
		an = a1 + (n - 1) * r;
		System.out.printf("O valor de N(ésimo - an) é: %.2f", an);
		
		input.close();
	}

}
