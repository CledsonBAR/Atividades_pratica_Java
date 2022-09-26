/*
** Programa: Superficie / Atividade 5
** Autor: Cledson Barreto Araújo
** Data: 23/09/2022
** Observações: Programa JAVA para medir a superficie esférica 
*/

import java.util.Scanner;

public class Superficie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("Digite o raio da esfera: ");
		raio = input.nextDouble();
		
		area = 4 * Math.PI * Math.pow(raio, 2);
		System.out.printf("A área da superficie da esfera é: %.2f", area);
		
		input.close();

	}

}
