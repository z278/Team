/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.UserPO;
import java.util.List;
import javax.swing.JOptionPane;
import tdao.GetDao;

/**
 *
 * @author hp
 */
public class GetAction extends ActionSupport{
    private String account_number;
    private String password;
    private double money;
    
    private String mess="input";
    private List list;

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    public void validate(){
        if(this.getAccount_number()==null||this.getAccount_number().length()==0){
            JOptionPane.showMessageDialog(null, "账号不能为空！");
        }else{
            GetDao gd = new GetDao();
            list=gd.queryInfo("account_number", this.getAccount_number());
            if(list==null || list.size()==0){
                JOptionPane.showMessageDialog(null, "该账号尚未注册！");
            }else{
                UserPO userPO= (UserPO)list.get(0);
                if(userPO.getAccount_number().equals(this.getAccount_number())){
                    if(userPO.getPassword().equals(this.getPassword())){
                        if(this.money <= 0){
                            JOptionPane.showMessageDialog(null, "输入取款数不是正数");
                        }else if(this.money > userPO.getMoney()){
                            JOptionPane.showMessageDialog(null, "账号余额不够");
                        }else {
                            userPO.setMoney(userPO.getMoney()-this.money);
                            boolean update=gd.updateInfo(userPO);
                            if(update){
                                mess="success";
                            };
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "登录密码不正确！");
                    }
                }
            }     
        }
        
    }
    public String execute() throws Exception{
        return mess;
    }
}