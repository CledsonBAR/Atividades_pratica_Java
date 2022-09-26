/*
** Programa: Quociente / Atividade 13
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que ao receber um número inteiro na variável "n", extrairá cada dígito da variável
*/

import java.util.Scanner;

public class Quociente {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.print("Digite um número inteiro: ");
        n = input.nextInt();
        
        System.out.println("Os dígitos de n são " + n/1000 + ", " + n%1000/100 + ", " + n%100/10 + " e " + n%10);
        
        input.close();
        
    }

}