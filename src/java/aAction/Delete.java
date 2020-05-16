/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aAction;

import com.opensymphony.xwork2.ActionSupport;
import entity.Teller;
import java.util.List;
import javax.swing.JOptionPane;
import tdao.TellerDao;

/**
 *
 * @author hp
 */
public class Delete extends ActionSupport{
    private String password;
    private String username;
    
    private String mess="input";
    private List list;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void validate(){
        if(this.getUsername()==null||this.getUsername().length()==0){
            JOptionPane.showMessageDialog(null, "用户名不能为空！");
        }else{
            TellerDao td = new TellerDao();
            list=td.queryInfo("account_number", this.getUsername());
            if(list==null || list.size()==0){
                JOptionPane.showMessageDialog(null, "该用户名尚未注册！");
            }else{
                Teller t= (Teller)list.get(0);
                if(t.getUsername().equals(this.getUsername())){
                    if(!t.getPassword().equals(this.getPassword())){
                        JOptionPane.showMessageDialog(null, "登录密码不正确！");
                    }else{
                        boolean b = td.deleteInfo(t.getId());
                        if(b){
                            mess="success";
                        }
                        
                    }
                }
            }     
        } 
    }
    
    public String execute() throws Exception{
        return mess;
    }
}
