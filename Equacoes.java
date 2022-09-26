/*
** Programa: Equacoes / Atividade 21
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que coleta dados para um sistema de equações lineares
*/

import java.util.Scanner;

public class Equacoes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c, d, e, f;

        System.out.println("Digite o valor de a: ");
        a = input.nextDouble();

        System.out.println("Digite o valor de b: ");
        b = input.nextDouble();

        System.out.println("Digite o valor de c: ");
        c = input.nextDouble();

        System.out.println("Digite o valor de d: ");
        d = input.nextDouble();

        System.out.println("Digite o valor de e: ");
        e = input.nextDouble();

        System.out.println("Digite o valor de f: ");
        f = input.nextDouble();

        double x, y;

        x = (c * e - b * f) / (a * e - b * d);
        y = (a * f - c * d) / (a * e - b * d);

        System.out.printf("O valor de x é: %.3f%n", x);
        System.out.printf("O valor de y é: %.3f%n", y);

        input.close();
    }
}