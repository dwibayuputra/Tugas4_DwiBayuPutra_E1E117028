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
public class manusiaSakti extends Manusia implements Dosen, Sniper {
    @Override
    public void menembak(){
        System.out.println("menembak...");
    }
    @Override    
    public void mengajar(){
        System.out.println("mengajar...");
    }
}
