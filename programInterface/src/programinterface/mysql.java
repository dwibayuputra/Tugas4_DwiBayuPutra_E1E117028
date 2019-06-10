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
public class mysql implements database {
    public void connect(){
        System.out.println("MySql connect...");
    }
    public void disconnect(){
        System.out.println("MySql disconnect...");
    }
}
