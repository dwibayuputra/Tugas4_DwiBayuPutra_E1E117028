/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author Bayu
 */
public class AbstractClass {
    static void test(binatang x){
        x.makan();
        x.tidur();
    }
    public static void main(String[] args) {
        binatang g = new gajah();
        binatang k = new kerbau();
        test(g);
        test(k);
    }
    
}
