/*
** Programa: PontoFlutuante / Atividade 20
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que coleta dados do usuário e calcula a área de diversas formas geométricas 
*/

import java.util.Scanner;

public class PontoFlutuante {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A, B, C;

        System.out.println("Digite o valor de A: ");
        A = input.nextDouble();

        System.out.println("Digite o valor de B: ");
        B = input.nextDouble();

        System.out.println("Digite o valor de C: ");
        C = input.nextDouble();

        double areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado;

        areaTrianguloRetangulo = (A * C) / 2;
        areaCirculo = 3.14159 * (C * C);
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = B * B;

        System.out.printf("A área do triângulo retângulo é: %.3f%n", areaTrianguloRetangulo);

        System.out.printf("A área do círculo é: %.3f%n", areaCirculo);

        System.out.printf("A área do trapézio é: %.3f%n", areaTrapezio);

        System.out.printf("A área do quadrado é: %.3f%n", areaQuadrado);

        input.close();
    }
}