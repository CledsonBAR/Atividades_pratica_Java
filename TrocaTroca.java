/*
** Programa: TrocaTroca / Atividade 22
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que coletará os valores das variáveis A e Bfará a troca dos valores e os apresentará trocados.
*/

import java.util.Scanner;

public class TrocaTroca {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o valor de a: ");
        a = input.nextInt();

        System.out.println("Digite o valor de b: ");
        b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.printf("O valor de a é: %d%n", a);
        System.out.printf("O valor de b é: %d%n", b);

        input.close();
    }
}