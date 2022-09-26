/*
** Programa: Montadora / Atividade 18
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que exibe o modelo do carro e calcula o preço de revenda com os impostos
*/

import java.util.Scanner;

public class Montadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        double precoFabrica, precoFinal;

        System.out.println("Digite o nome do automóvel: ");
        nome = input.nextLine();

        System.out.println("Digite o preço de fábrica: R$ ");
        precoFabrica = input.nextDouble();

        precoFinal = precoFabrica + (precoFabrica * 0.45) + (precoFabrica * 0.28);
        System.out.printf("O preço final do automóvel " + nome + " é R$ %.2f: ", precoFinal);

        input.close();
    }
}