/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

/**
 *
 * @author ARTHUR
 */
public class Repeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 2 || cc == 4) {
                continue; // começo do laço de repetição
            }
            if (cc == 9) {
                break; // final do laço de repetição
            }
            System.out.println(cc);
        }
        
        int dd = 0;
        
        do {
            dd++;
            System.out.println("Do: " + dd);
        } while (dd < 4);
        
        for (int ee = 1; ee < 5; ee++) {
            System.out.println("For: " + ee);
        }
    }
    
}
