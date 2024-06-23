/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datastructure;

import java.util.ArrayList;

/**
 *
 * @author atako
 * @param <E>
 */
public class Tree234Node<E extends Comparable<E>> {
    
     // elements has maximum three values

    ArrayList<E> elements = new ArrayList<>(3);
    // Each has maximum four children
    ArrayList<Tree234Node<E>> child  = new ArrayList<>(4);

    /**
     * Create an empty Tree24 node
     */
    Tree234Node() {
    }

    /**
     * Create a Tree24 node with an initial element
     */
    Tree234Node(E o) {
        elements.add(o);
    }
}
