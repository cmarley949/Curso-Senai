/*
 * 
 * Jogo da advinhação nesse jogo o usuário terá 3 chanses de acertar o numero sorteado pelo programa 
 * 
 */
package jogoadvinhacao;
import java.util.Random;
import javax.swing.JOptionPane;

public class JogoAdvinhacao {

    public static void main(String[] args) {
        Random rd = new Random();
        int numeroSecreto = rd.nextInt(10) + 1;
        int tentativas;
        int tentativasRestantes = 3;
        
        JOptionPane.showMessageDialog(null, "Você tem 3 Tentativas para advinhar um número entre 1 e 10", "Jogo da Adivinhação", 1);
        
        String msg = "";
        while (tentativasRestantes > 0) {
            String tentativaStr = JOptionPane.showInputDialog(null, "Digite seu palpite", "Jogo da Adivinhação", 3);
            tentativas = Integer.parseInt(tentativaStr); // Transformar conteúdo (mudar o tipo)
            if (tentativas == numeroSecreto) {
                msg = "Parabéns! Você acertou o número secreto.";
                break;
            } else if (tentativas < numeroSecreto) {
                msg = "Seu Palpite é menor do que o número secreto."; // Seu número
            } else {
                msg = "Seu Palpite é maior do que o número secreto."; // Seu número
            }
            JOptionPane.showMessageDialog(null, msg, "Jogo da Adivinhação", 2);
            tentativasRestantes--;
            
            if (tentativasRestantes == 0) {
                msg = "Você não acertou o número secreto";
                msg = msg + "\n O número secreto era " + numeroSecreto;
            }  
        }
        JOptionPane.showMessageDialog(null, msg, "Jogo da Adivinhação", 1);

    }
    
}
