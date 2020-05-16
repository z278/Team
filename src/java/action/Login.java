/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import cdao.AccountDao;
import com.opensymphony.xwork2.ActionSupport;
import dao.AdminDao;
import entity.Admin;
import entity.Teller;
import entity.UserPO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;
import tdao.TellerDao;

/**
 *
 * @author hp,syr
 */
public class Login extends ActionSupport{
    private String password;
    private String username;
    private String checkcode;
    private Integer radiobutton;
    
    private HttpServletRequest request;
    private List list;
    private String message="input";
    
    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }
    
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
        
        if(radiobutton==1){
            if(this.getUsername()==null||this.getUsername().length()==0){
                JOptionPane.showConfirmDialog(null, "账号不能为空！");
            }else{
                AccountDao ac = new AccountDao();
                list=ac.queryInfo("getAccount_number", this.getUsername());
                if(list.size()==0){
                    JOptionPane.showConfirmDialog(null, "该账号尚未注册！");
                }else{
                    UserPO u = new UserPO();
                    int count=0;
                    for(int i=0;i<list.size();i++){
                        count++;
                        u = (UserPO)list.get(i);
                        if(this.getUsername().equals(u.getAccount_number())){
                            if(u.getPassword().equals(this.getPassword())){
                                message="account";
                            }else{
                                JOptionPane.showConfirmDialog(null, "登录密码不正确！");
                            }
                        }
                    }
                }
            }
        }else if(radiobutton==2){
            if(this.getUsername()==null||this.getUsername().length()==0){
                JOptionPane.showConfirmDialog(null, "账号不能为空！");
            }else{
                TellerDao td = new TellerDao();
                list=td.queryInfo("username", this.getUsername());
                if(list.size()==0){
                    JOptionPane.showConfirmDialog(null, "该账号尚未注册！");
                }else{
                    Teller t = new Teller();
                    int count=0;
                    for(int i=0;i<list.size();i++){
                        count++;
                        t = (Teller)list.get(i);
                        if(this.getUsername().equals(t.getUsername())){
                            if(t.getPassword().equals(this.getPassword())){
                                message="teller";
                            }else{
                                JOptionPane.showConfirmDialog(null, "登录密码不正确！");
                            }
                        }
                    }
                }
            }
        }else if(radiobutton==3){
            if(this.getUsername()==null||this.getUsername().length()==0){
                JOptionPane.showConfirmDialog(null, "账号不能为空！");
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
        }else if(this.getCheckcode()==null||this.getCheckcode().length()==0){
                JOptionPane.showConfirmDialog(null, "验证码不能为空！");
        }else{
            message="input";
        }
    }
    
    
    @Override
    public String execute() throws Exception{
        return message;
    }
}
