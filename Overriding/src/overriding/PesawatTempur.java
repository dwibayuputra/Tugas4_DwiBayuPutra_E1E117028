/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author Bayu
 */
public class PesawatTempur extends Pesawat {
    int rudal=4;
    
    void manuver(){
        System.out.println("manuver...");
    }
    void terbang(){
        System.out.println("terbang ala tempur...");
    }
}