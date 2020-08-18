/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaoexercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author ARTHUR
 */
public class RepeticaoExercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, valores = 0, par = 0, impar = 0, acima = 0, media = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor \n (0 interrompe)"));
            if (n == 0) {
                break;
            }
            valores++;
            if (n % 2 == 1) {
                impar++;
            }
            else {
                par++;
            }
            if (n > 100) {
                acima++;
            }
            media += n;
        } while (n != 0);
     
    
    media = media / valores;
    JOptionPane.showMessageDialog(null, "Resultado: \n ------------ \n Total de valores: " + valores + "\n Total de Pares: " + par + "\n Total de Impares: " + impar + "\n Acima de 100: " + acima + "\n Média de valores: " + media);    
    }
}
