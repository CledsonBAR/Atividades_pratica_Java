/*
** Programa: OrdemCrescente / Atividade 12
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que lê três valores inteiros distintos e os escreve em ordem crescente.
*/

import java.util.Scanner;

public class OrdemCrescente {
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        int n1, n2, n3;
        
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        n3 = input.nextInt();
        
        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println(n1 + " " + n2 + " " + n3);
            } else {
                System.out.println(n1 + " " + n3 + " " + n2);
            }
        } else if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println(n2 + " " + n1 + " " + n3);
            } else {
                System.out.println(n2 + " " + n3 + " " + n1);
            }
        } else if (n3 < n1 && n3 < n2) {
            if (n1 < n2) {
                System.out.println(n3 + " " + n1 + " " + n2);
            } else {
                System.out.println(n3 + " " + n2 + " " + n1);
            }
            input.close();
        }
    }
}