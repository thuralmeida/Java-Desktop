/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author ARTHUR
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 5;
        int n2 = 3;
        float m = (n1 + n2) / 2;
        System.out.println("A média é: " + m);
        System.out.printf("A média é: %.2f \n", m);
        
        double ale = Math.random();
        int n = (int) (5 + ale * (10 - 5));
        System.out.println(ale);
        System.out.println(n);
    }
    
}
