/*
** Programa: Salario / Atividade 7
** Autor: Cledson Barreto Araújo
** Data: 23/09/2022
** Observações: Programa JAVA para calcular o reajuste num determinado salário
*/


import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario, reajuste, novosalario;

        System.out.println("Digite o valor do salário:\n ");
        salario = entrada.nextDouble();

        System.out.println("Digite o valor do reajuste:\n ");
        reajuste = entrada.nextDouble();

        novosalario = salario + (salario * (reajuste / 100));
		
        System.out.printf("O salário novo é = R$ %.2f \n",novosalario);
        
        entrada.close();
        }
    }