/*
** Programa: Esferas / Atividade 3
** Autor: Cledson Barreto Araújo
** Data: 23/09/2022
** Observações: Programa JAVA para calcular o volume de uma esfera
*/

import java.util.Scanner;

public class Esferas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double raio, volume;
		
		System.out.println("Digite o raio da esfera: ");
		raio = input.nextDouble();
		
		volume =  (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
		System.out.printf("O volume da esfera é: %.2f", volume);
		
		input.close();
	}

}
