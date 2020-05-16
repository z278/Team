/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aAction;

import com.opensymphony.xwork2.ActionSupport;
import dao.AdminDao;
import entity.Admin;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ChangPass extends ActionSupport{
    private String username;
    private String password1;
    private String password2;
    
    private String mess="input";
    private List list;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
    
    public void validate(){
        if(this.getUsername()==null||this.getUsername().length()==0){
            JOptionPane.showMessageDialog(null, "用户名不能为空！");
            addFieldError("username","");
        }else{
            AdminDao ad = new AdminDao();
            list=ad.queryInfo("username", this.getUsername());
            if(list==null || list.size()==0){
                JOptionPane.showMessageDialog(null, "该用户名尚未注册！");
                addFieldError("username","");
            }else{
                if(this.getPassword1()==null||this.getPassword1().length()==0){
                    JOptionPane.showMessageDialog(null,"登录密码不允许为空！");
                    addFieldError("password1","");
                }else if(this.getPassword2()==null||this.getPassword2().length()==0){
                    JOptionPane.showMessageDialog(null,"重复密码不允许为空！");
                    addFieldError("password2","");
                }else if(!this.getPassword1().equals(this.getPassword2())){
                    JOptionPane.showMessageDialog(null,"两次密码不一致，请认真核对！");
                    addFieldError("password2","");
                }else{
                    for(int i = 0; i < password1.length(); i++){
                        if(this.getPassword1().toCharArray()[i] > '9' || this.getPassword1().toCharArray()[i] < '0'){
                            JOptionPane.showMessageDialog(null,"登录密码必须为数字，请重新设置！");
                            addFieldError("password1","");
                            break;
                        }
                    }    
                }
            }     
        }
        
    }
    
    
    public Admin user(){
        AdminDao ad = new AdminDao();
        list=ad.queryInfo("username", this.getUsername());
        Admin a= (Admin)list.get(0);
        a.setPassword(this.getPassword1());
        return a;
    }
   public String execute() throws Exception{
        AdminDao ad = new AdminDao();
        boolean ri=ad.updateInfo(user());
        if(ri){
            mess="success";
        }
        return mess;
    }
}
