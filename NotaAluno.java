/*
** Programa: Montadora / Atividade 19
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que coleta as notas de um aluno e exibe sua média
*/

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double notaA, notaB, notaC;

        System.out.println("Digite a primeira nota: ");
        notaA = input.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        notaB = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        notaC = input.nextDouble();

        double media = (notaA * 2 + notaB * 3 + notaC * 5) / 10;

        System.out.printf("A média final é: %.1f)%n", media);
        
        input.close();
    }
}