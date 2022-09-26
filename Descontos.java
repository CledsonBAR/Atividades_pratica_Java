/*
** Programa: Descontos / Atividade 23
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que coleta os dados do veículo e informa o desconto concedido e o valor a pagar 
*/

import java.util.Scanner;

public class Descontos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double combustivel, desconto, totalDesconto = 0, totalPago = 0;
        int valor = 0;

        System.out.println("Digite o valor do veículo: ");
        valor = input.nextInt();

        System.out.println("Digite o tipo do combustível: 1 = Álcool, 2 = Gasolina, 3 = Diesel, 4 = Fim");
        combustivel = input.nextDouble();             
            
            if (combustivel == 1) {
                desconto = valor * 0.28;
            } else if (combustivel == 2) {
                desconto = valor * 0.22;
            } else if(combustivel == 3) {
                desconto = valor * 0.12;
            }else{
                desconto = 0;
            }
            totalDesconto += desconto;
            totalPago += valor - desconto;
        
        System.out.printf("O cliente teve um desconto total de: R$ %.2f%n", totalDesconto);
        System.out.printf("O cliente pagará o total de : R$ %.2f%n", totalPago);

        input.close();
    }
}
