/*
** Programa: Fabrica / Atividade 16
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que coleta o tempo em segundos e converte em horas, minutos e segundos.
*/

import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tempo, horas, minutos, segundos;

        System.out.println("Digite o tempo de duração do evento em segundos: ");
        tempo = input.nextInt();
        
        horas = tempo / 3600;
        minutos = (tempo % 3600) / 60;
        segundos = (tempo % 3600) % 60;

        System.out.println("O evento durou " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");

        input.close();
    }
}