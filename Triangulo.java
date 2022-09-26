/*
** Programa:Triangulo / Atividade 1
** Autor: Cledson Barreto Araújo
** Data: 23/09/2022
** Observações: Programa JAVA para medir a área de um triângulo retângulo
*/
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double base; 
		double altura; 
		double area;
		
		System.out.println("Digite a base do triângulo retângulo = " );
		base = input.nextDouble();
		
		System.out.println("Digite a altura do triangulo retângulo = " );
		altura = input.nextDouble();
		
		area = base * altura / 2 ;
		System.out.printf("A área do triangulo retangulo é = " + area);
		
		input.close();

	}

}
