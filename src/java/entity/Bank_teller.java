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
public class Bank_teller {
    private int id;
    private String account_number;
    private String password;
    private String id_number;
    private String address;
    private String phone;
    private String name;
    private double money;

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getaccount_number() {
        return account_number;
    }

    public void setaccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
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

    public double getmoney() {
        return money;
    }

    public void setmoney(double money) {
        this.money = money;
    }
    
}