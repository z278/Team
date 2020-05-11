/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.AdminDao;
import entity.Admin;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Login extends ActionSupport{
    private String password;
    private String username;
    private Integer radiobutton;
    
    private HttpServletRequest request;
    private List list;
    private String message="input";
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRadiobutton() {
        return radiobutton;
    }

    public void setRadiobutton(Integer radiobutton) {
        this.radiobutton = radiobutton;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void validate(){
        if(radiobutton==3){
            if(this.getUsername()==null||this.getUsername().length()==0){
                addFieldError("username","账号不能为空！");
            }else{
                AdminDao ad=new AdminDao();
                list=ad.queryInfo("username", this.getUsername());
                if(list.size()==0){
                    JOptionPane.showConfirmDialog(null, "该账号尚未注册！");
                }else{
                    Admin am=new Admin();
                    int count=0;
                    for(int i=0;i<list.size();i++){
                        count++;
                        am=(Admin)list.get(i);
                        if(this.getUsername().equals(am.getUsername())){
                            if(am.getPassword().equals(this.getPassword())){
                                message="success";
                            }else{
                                JOptionPane.showConfirmDialog(null, "登录密码不正确！");
                            }
                        }
                    }
                }
            }
        }else{
            message="input";
        }
    }
    
    
    
    public String execute(){
        return message;
    }
}
