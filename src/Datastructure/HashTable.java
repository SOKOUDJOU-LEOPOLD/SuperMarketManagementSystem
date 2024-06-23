/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datastructure;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author atako
 * @param <E>
 */
public class HashTable<E extends Comparable<E>> {
    
    private int size = 21;
    private final Tree234<E>[] table ;
    private final ArrayList<E> tableList = new ArrayList<>();

    
    public HashTable() {
        table = (Tree234<E>[])Array.newInstance(Tree234.class, this.size);  // reflection    --- creating an array of generic type.
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public int getIndex(E e) {  // to produce the index of the object from its key
        return (Math.abs(e.hashCode())%size);
    }
    
    public boolean add(E e) {
        
        tableList.add(e);
        int index = getIndex(e);
        if(table[index] == null) {
            table[index] = new Tree234<>();
            table[index].insert(e);
            return true;
        }
        else if (table[index] != null) {
            table[index].insert(e);
            return true;
        }
        
        return false;
        
    }
    
    public boolean search(E e) {
        
        int index = getIndex(e);
        return table[index].search(e);
        
    }
    
    public boolean delete(E e) {
        
        if(search(e)) {
           // tableList.remove(e);
            int index = getIndex(e);
            table[index].delete(e);
            return true;
        }
        
        return false;
    }
    
    public boolean update(E oldValue, E newValue) {
        
        if(delete(oldValue))
            add(newValue);
        
        return false;
    }
    
    public void display() {
        for(int i = 0; i < tableList.size(); i++) {
            System.out.print("Element at index: " + i + ": " + tableList.get(i));
            //table[i].inorder();
            System.out.println("");
        }
    }

    public ArrayList<E> getTableList() {
        return tableList;
    }
    
    
}
