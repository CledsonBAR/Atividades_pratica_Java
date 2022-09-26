/*
** Programa: BandaLarga / Atividade 3
** Autor: Cledson Barreto Araújo
** Data: 24/09/2022	
** Observações: Programa JAVA que medirá o tempo total para o usuário fazer o download de um determinado arquivo.
*/

import javax.swing.JOptionPane;

public class BandaLarga {
	
    public static void main(String[] args) {
    	
        String arquivo = JOptionPane.showInputDialog("Tamanho do arquivo (em bytes): ");
        
        String velocidade = JOptionPane.showInputDialog("Velocidade de conexão à internet: ");
        
        int tamanho = Integer.parseInt(arquivo);
        
        int tempo = tamanho  / 250000;
        
        JOptionPane.showMessageDialog(null, "Tamanho do arquivo em bytes: " + tamanho + "\n"
        		+ "Segundos necessários para download: " + tempo );
    }
}

