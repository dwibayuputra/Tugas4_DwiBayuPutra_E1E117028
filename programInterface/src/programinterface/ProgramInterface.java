/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programinterface;

/**
 *
 * @author Bayu
 */
public class ProgramInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        database d = new mysql();
        d.connect();
        d.disconnect();
        
    }
    
}
