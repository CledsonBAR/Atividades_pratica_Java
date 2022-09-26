/*
** Programa: CalculadoraSalario / Atividade 9
** Autor: Cledson Barreto Araújo
** Data: 23/09/2022
** Observações: Programa JAVA para calcular o salário com descontos do INSS
*/

import java.util.Scanner;

public class CalculadoraSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double valor_horas_aulas, numeros_aulas, descontoINSS, salario, Salario_liquido;
		
		System.out.println("Digite o valor da hora aula: ");
		valor_horas_aulas = input.nextDouble();
		
		System.out.println("Digite o número de horas aulas ministradas no mês: ");
		numeros_aulas = input.nextDouble();
		
		System.out.println("Digite o percentual de desconto do INSS: ");
		descontoINSS = input.nextDouble();
		
		salario = valor_horas_aulas * numeros_aulas;
		Salario_liquido = salario - (salario * (descontoINSS / 100));
		System.out.printf("O salário líquido do professor é de: R$ %.2f ", Salario_liquido);
		
		input.close();
	}

}
