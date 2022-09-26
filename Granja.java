/*
** Programa: Granja / Atividade 17
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que gerencia os gastos da granja totalizando os custos para identificar e 
** controlar a alimentação de cada frango da sua produção.
*/

import java.util.Scanner;

public class Granja {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroFrangos;
        float chip, anel;

        System.out.println("Informe o número de frangos: ");
        numeroFrangos = entrada.nextInt();

        System.out.println("Informe o valor do anel com chip: R$ ");
        chip = entrada.nextFloat();

        System.out.println("Informe o valor do anel de alimentação: R$ ");
        anel = entrada.nextFloat();

        double gastoTotal = numeroFrangos * (chip + (anel * 2));

        System.out.printf("O gasto total da granja para controlar os frangos é de R$ %.2f %n", gastoTotal);

        entrada.close();
    }
}