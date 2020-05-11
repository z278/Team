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
public class Account {
    private int id;
    private String account_number;
    private String password;
    private String name;
    private double money;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
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