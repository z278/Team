/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author syr
 */
public class Depositor {
    private int id;
    private String id_number;
    private String address;
    private String phone;
    private String name;

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getaddress(){
        return this.address;
    }
    public void setaddress(String address){
        this.address=address;
    }    
    
    public String getid_number() {
        return id_number;
    }

    public void setid_number(String id_number) {
        this.id_number= id_number;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    
}