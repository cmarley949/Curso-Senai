/*
 * 
 * Nesse programa vamos estudar a estrutura if - else 
 * 
 */
package aula8e;
import javax.swing.JOptionPane;

public class Aula8e {


    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno", "Escola Celso Charuri", 3);
        
        String mediaString = JOptionPane.showInputDialog(null, "Digite a media final do aluno: ", "Escola Celso Charuri", 3);
        
        double media = Double.parseDouble(mediaString);
        
        if (media >= 9) {
            JOptionPane.showMessageDialog(null, "O Aluno " + nome.toUpperCase() + " foi aprovado com louvor, oh glória!!", "Escola Celso Charuri", 3);
        } else if (media >= 6 && media < 9) {
            JOptionPane.showMessageDialog(null, "O Aluno " + nome.toUpperCase()  + " foi aprovado !!", "Escola Celso Charuri", 3);
        } else if (media >= 3 && media < 6){
            JOptionPane.showMessageDialog(null, "O Aluno " + nome.toUpperCase()  + " ficou de recuperação :-(", "Escola Celso Charuri", 3);
        } else {
            JOptionPane.showMessageDialog(null, "O Aluno " + nome.toUpperCase()  + " foi reprovado(a) :-(", "Escola Celso Charuri", 3);
        }
    }
    
}
