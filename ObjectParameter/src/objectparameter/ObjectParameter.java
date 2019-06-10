/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectparameter;

/**
 *
 * @author Bayu
 */
public class ObjectParameter {

   static void test(gajah x){
       x.makan();
       x.tidur();
   }
   static void test(kerbau x){
       x.makan();
       x.tidur();
   }
   
    public static void main(String[] args) {
        gajah g = new gajah();
        kerbau k = new kerbau();
        
        test(g);
        test(k);
    }
    
}
