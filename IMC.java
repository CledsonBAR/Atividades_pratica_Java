/*
** Programa: IMC / Atividade 25
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022
** Observações: Programa JAVA que coletará os dados de peso e altura e informará como está a situação do IMC.
*/

import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {

        double peso, altura, imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));

        imc = peso / (altura * altura);
        
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, " Seu índice de massa corporal (IMC) é = " + imc + "\n" 
                    + " Abaixo do peso normal ");
        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, " Seu índice de massa corporal (IMC) é = " + imc + "\n"
                    + " Peso normal ");
        } else if (imc >= 25.0 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, " Seu índice de massa corporal (IMC) é = " + imc + "\n"
                    + " Excesso de peso ");
        } else if (imc >= 30.0 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, " Seu índice de massa corporal (IMC) é = " + imc + "\n"
                    + " Obesidade classe I ");
        } else if (imc >= 35.0 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, " Seu índice de massa corporal (IMC) é = " + imc + "\n"
                    + " Obesidade classe II ");
        } else {
            JOptionPane.showMessageDialog(null, " Seu índice de massa corporal (IMC) é = " + imc + "\n"
                    + " Obesidade classe III ");
        }
    }
}
