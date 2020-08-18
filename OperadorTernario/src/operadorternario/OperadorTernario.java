/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author ARTHUR
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1 > n2) ? n1 : n2;
        System.out.println(r);
        
        String nome1 = "Arthur";
        String nome2 = "Arthur";
        String nome3 = new String("Arthur");
        String res, res2;
        res = (nome1 == nome3) ? "igual" : "diferente";
        res2 = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);
        System.out.println(res2);
    }
    
}
