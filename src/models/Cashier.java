/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Objects;

/**
 *
 * @author atako
 */
public class Cashier implements Comparable<Cashier>{
    private String id;
    private Integer qtyRegistered;
    private String pwd;


    @Override
    public int compareTo(Cashier t) {
        return this.qtyRegistered.compareTo(t.qtyRegistered);
    }  
    
    
    public String getId() {
        return id;
    }

    public Cashier() {
    }

    public Cashier(String id,  int qtyRegistered, String pwd) {
        this.id = id;
        this.qtyRegistered = qtyRegistered;
        this.pwd = pwd;
    }

    public Cashier(String id, int qtyRegistered) {
        this.id = id;
        this.qtyRegistered = qtyRegistered;
    }

    public Cashier(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }
    

    public Cashier( int qtyRegistered) {
        this.qtyRegistered = qtyRegistered;
    }

    public String getPwd() {
        return pwd;
    }
    

    public int getQtyRegistered() {
        return qtyRegistered;
    }

    public void setQtyRegistered(int qtyRegistered) {
        this.qtyRegistered = qtyRegistered;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cashier other = (Cashier) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Cashier{" + "qtyRegistered=" + qtyRegistered + ", pwd=" + pwd + '}';
    }
    
    
}
