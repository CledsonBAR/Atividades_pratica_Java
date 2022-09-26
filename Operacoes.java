/*
** Programa: Operacoes / Atividade 2
** Autor: Cledson Barreto Araújo
** Data: 23/09/2022
** Observações: Programa JAVA para para exibir operações matemáticas
*/

import java.util.Scanner;

public class Operacoes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y;
		int soma, subtracao, multiplicacao, divisao, resto;
		
		System.out.println("Digite o primeiro número");
		x = input.nextInt();
		
		System.out.println("Digite o segundo número");
		y = input.nextInt();
		
		soma = x + y;
		subtracao = x - y;
        multiplicacao = x * y;
        divisao = x / y;
        resto = x % y;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
        
		input.close();
	}

}
