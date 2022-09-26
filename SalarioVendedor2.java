/*
** Programa: SalarioVendedor2 / Atividade 15
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que coleta o nome do vendedor, salário fixo, vendas do mês, calcula a comissão e 
** soma ao salário.
*/

import java.util.Scanner;

public class SalarioVendedor2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;
        double salario, vendas, total;

        System.out.println("Nome do vendedor: ");
        nome = input.nextLine();

        System.out.println("Salário fixo: R$ ");
        salario = input.nextDouble();

        System.out.println("Total de vendas: R$ ");
        vendas = input.nextDouble();        

        total = salario + (vendas * 0.08);       

        System.out.printf("O salário fixo de " + nome +  " é R$ %.2f %n", salario);

        System.out.printf("O seu salário no final do mês somado às suas comissões é R$ %.2f %n", total);

        input.close();
    }
}