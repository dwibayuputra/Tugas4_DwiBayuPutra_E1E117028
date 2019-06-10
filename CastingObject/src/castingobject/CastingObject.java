/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingobject;

/**
 *
 * @author Bayu
 */
public class CastingObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        binatang g = new gajah();
        g.makan();
        g.tidur();
        ((gajah)g).duduk();
    }
    
}
