/*
** Programa: TermosPA / Atividade 11
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA para informar os termos da série de uma Progressão Aritmética. 
*/
import java.util.Scanner;

public class TermosPA {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int a1;
        int an;
        int n;
        int soma;
        
        System.out.print("Digite o primeiro termo: ");
        a1 = input.nextInt();

        System.out.print("Digite o último termo: ");
        an = input.nextInt();

        System.out.print("Digite o número de termos: ");
        n = input.nextInt();
        
        soma = ( a1 + an ) * n / 2;
        
        System.out.println( "A soma dos termos é: " + soma );

        input.close();
        
    }

}
