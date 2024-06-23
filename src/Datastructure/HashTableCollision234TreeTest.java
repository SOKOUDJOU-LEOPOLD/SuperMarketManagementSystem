/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datastructure;

import java.util.ArrayList;
import models.Customer;
import models.Product;

/**
 *
 * @author atako
 */
public class HashTableCollision234TreeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> l2;
        HashTable<Product> table = new HashTable<>();
        Product c1 = new Product("Ve", "Sony-xbox", new Float(10.9), 98, 121, "pepeonzima");
        Product c2 = new Product("Va","KIngfh", new Float(100.9), 611, 21, "pepeonzima");
        Product c3 = new Product("Vb","Pegasus", new Float(145.9), 501, 24, "pepeonzima");
        Product c4 = new Product("Vc","Nestor", new Float(1025.2),901, 14, "pepeonzima");
        table.add(c1);
        table.add(c2);
        table.add(c3);
        table.add(c4);
        table.display();
        System.out.println(new Product("Vc","Nestor", new Float(1025.2),901, 14, "pepeonzima"));
        //String name, float unitPrice, int quantity, int quantitySell, String category
        /*table.add(10);
        table.add(20);
        table.add(30);
        table.add(11);
        table.add(21);
        table.add(31);
        table.add(12);
        table.add(22);
        table.add(32);
        table.add(13);
        table.add(23);
        table.add(33);
        table.add(14);
        table.add(24);
        table.add(34);
        table.display();
        System.out.println("\nDeleting now...");
        table.delete(20);
        table.delete(31);
        table.delete(11);
        table.delete(34);
        table.display();
        if(table.search(34))
            System.out.println("34 is part of the table!!");
        else
            System.out.println("34 Not found!!");
        
        l2 = table.getTableList();
        
        System.out.println("Table list: ");
        for(int i=0; i < l2.size(); i++) {
            System.out.print(l2.get(i) + " ");
        }*/
    }
    
    
    
}
