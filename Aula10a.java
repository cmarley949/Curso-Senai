/*
 * 
 * Nesse programa vamos estudar o uso da estrutura de 
 *  decisão if else
 * 
 */
package aula10a;
import javax.swing.JOptionPane;

public class Aula10a {

    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog(null, "Digite um numero inteiro", "Verificacao de numero par ou impar", 1);
        
        int numero = Integer.parseInt(numeroString);
        
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "o numero digitado é Par " + numero, "Verificacao de numero par ou impar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "o numero digitado é Impar " + numero, "Verificacao de numero par ou impar", 1);
        }
        
        
    }
    
}
