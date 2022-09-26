/*
** Programa: SalarioVendedor / Atividade 14
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que coleta o nome do vendedor, salário fixo, vendas do mês, calcula a comissão e 
** soma ao salário.
*/

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;
        double salario, vendas, total;

        System.out.print("Nome do vendedor: ");
        nome = input.nextLine();
        System.out.print("Salário fixo: R$ ");
        salario = input.nextDouble();
        System.out.print("Total de vendas: R$ ");
        vendas = input.nextDouble();

        total = salario + (vendas * 0.15);

        System.out.printf("O salário de " + nome +  " é R$ %.2f %n", total);

        input.close();
    }
}