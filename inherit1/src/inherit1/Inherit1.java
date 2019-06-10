/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit1;

/**
 *
 * @author Bayu
 */
public class Inherit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pesawat boeing = new Pesawat();
        PesawatTempur f16 = new PesawatTempur();
        
        boeing.terbang();
        f16.terbang();
        
        boeing.mendarat();
        f16.mendarat();
        
        //boeing.manuver();
        f16.manuver();
    }
}
