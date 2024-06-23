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
public class Admin {
    private String id;
    private String fname;
    private String lname;
    private String pwd;

    public Admin() {
    }

    public Admin(String id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public Admin(String id, String fname, String lname, String pwd) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.pwd = pwd;
    }

    public Admin(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "Admin{" + "fname=" + fname + ", lname=" + lname + ", pwd=" + pwd + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final Admin other = (Admin) obj;
        return true;
    }
    
    
    
    
    
    
}
