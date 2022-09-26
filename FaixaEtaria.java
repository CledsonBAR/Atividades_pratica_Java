/*
** Programa: FaixaEtaria / Atividade 24
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que classificará os nadadores por faixa etária.
*/

import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idade;

        System.out.print("Digite a idade do nadador: ");
        idade = input.nextInt();

        if (idade >= 4 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 9) {
            System.out.println("Infantil B");
        } else if (idade >= 10 && idade <= 12) {
            System.out.println("Juvenil A");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("Sênior");
        } else {
            System.out.println("Idade fora da faixa etária");
            input.close();
        }
    }
}