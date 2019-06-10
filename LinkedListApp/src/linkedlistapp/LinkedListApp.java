/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistapp;

/**
 *
 * @author Bayu
 */
public class LinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.addFirst(1);
        link.addFirst(2);
        link.addLast(3);
        link.addLast(4);
        link.tampilkan();
        link.deleteLast();
        link.tampilkan();
    }
    
}
