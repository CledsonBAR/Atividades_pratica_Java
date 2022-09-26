/*
** Programa: Conversor / Atividade 6
** Autor: Cledson Barreto Araújo
** Data: 23/09/2022
** Observações: Programa JAVA para conversão de real em dólar
*/

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double cotacao_dolar, valor_real;
		
		System.out.println("Digite o valor em real:");
		valor_real = entrada.nextDouble();
		
		System.out.println("Digite o valor da cotação do dólar:");
		cotacao_dolar = entrada.nextDouble();
		
		valor_real = valor_real / cotacao_dolar;
		
		System.out.printf("O valor em dólares é = R$ %.2f \n", valor_real );
		
		entrada.close();

	}

}
