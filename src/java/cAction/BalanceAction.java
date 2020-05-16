/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cAction;

import com.opensymphony.xwork2.ActionSupport;
import entity.UserPO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;
import org.apache.struts2.ServletActionContext;
import tdao.GetDao;

/**
 *
 * @author hp
 */
public class BalanceAction extends ActionSupport{
    private String account_number;
    private String password;
    
    private String mess="input";
    private List list;
    private HttpServletRequest request;

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
                        mess = "success";
                    }else{
                        JOptionPane.showMessageDialog(null, "登录密码不正确！");
                    }
                }
            }     
        }
    }
    
    public String execute() throws Exception{
        GetDao gd = new GetDao();
        request=ServletActionContext.getRequest();
        list=gd.queryInfo("account_number", this.account_number);
        request.getSession().setAttribute("balance", list);
        return mess;
    }
}
