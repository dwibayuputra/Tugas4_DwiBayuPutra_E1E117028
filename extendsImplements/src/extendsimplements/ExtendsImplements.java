/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendsimplements;

/**
 *
 * @author Bayu
 */
public class ExtendsImplements {
    static void tesDosen(Dosen d){
        d.mengajar();
    }
    static void tesSniper(Sniper d){
        d.menembak();
    }
    static void tesManusia(Manusia d){
        d.bernafas();
    }
      
    public static void main(String[] args) {
        manusiaSakti budi = new manusiaSakti();
        testDosen(budi);
        testSniper(budi);
        testManusia(budi);
    }
    
}

