/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Bayu
 */
public class Polymorphism {

    static void test(binatang x){
        x.tidur();
        x.makan();
    }
    public static void main(String[] args) {
        gajah g = new gajah();
        kerbau k = new kerbau ();
        
        test(g);
        test(k);
    }
    
}
