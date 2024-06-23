/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datastructure;

/**
 *
 * @author leopo
 */
public class Tree234Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tree234 tree24 = new Tree234();
        
        tree24.insert(34);
        tree24.insert(3);
        tree24.insert(50);
        tree24.insert(20);
        tree24.insert(15);
        tree24.insert(16);
        tree24.insert(25);
        tree24.insert(27);
        tree24.insert(29);
        tree24.insert(24);
        
        tree24.inorder();
        System.out.println("\n");
        tree24.preorder();
        System.out.println("\n");
        tree24.postorder();
    }
    
}
