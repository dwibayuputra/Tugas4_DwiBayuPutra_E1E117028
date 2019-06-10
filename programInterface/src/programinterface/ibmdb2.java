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
public class ibmdb2 implements database {
    public void connect(){
        System.out.println("ibm db2 connect...");
    }
    public void disconnect(){
        System.out.println("ibm db2 disconnect...");
    }
}
