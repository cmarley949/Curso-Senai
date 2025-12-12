/*
 * 
 * Nesse programa vamos usar a estrutura while 
 * Números fornecidos pelos usuários
 * 
 */
package aula10cc;
import javax.swing.JOptionPane;

public class Aula10cc {

    public static void main(String[] args) {
        int soma = 0;
        int resposta = 0;
        
        while (resposta == 0) {
            String num = JOptionPane.showInputDialog(null, "Digite o número para soma", "Calculadora Simples", 3);
            soma = soma + Integer.parseInt(num);
            resposta = JOptionPane.showConfirmDialog(null, "Deseja Inserir outro Número? " + soma, "Calculadora Simples", JOptionPane.YES_NO_OPTION, 3);
        }
        JOptionPane.showMessageDialog(null, "A soma dos números digitados é " + soma, "Calculadora Simples", 1);
        
    }
    
}
