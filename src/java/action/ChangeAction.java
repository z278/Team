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
 * @author 史一然（修改）
 */
public class ChangeAction extends ActionSupport{
    private String id_number;
    private String account_number;
    private String password1;
    private String password2;
    
    private String mess="input";
    private List list;

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
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
        if(this.getAccount_number()==null||this.getAccount_number().length()==0){
            JOptionPane.showMessageDialog(null, "账号不能为空！");
            addFieldError("account_number","");
        }else{
            GetDao gd = new GetDao();
            list=gd.queryInfo("account_number", this.getAccount_number());
            List list2 = gd.queryInfo("id_number", this.getId_number());
            if(list==null || list.size()==0){
                JOptionPane.showMessageDialog(null, "该账号尚未注册！");
                addFieldError("account_number","");
            }else{
                UserPO userPO= (UserPO)list.get(0);
                if(userPO.getAccount_number().equals(this.getAccount_number())){
                    if(userPO.getId_number().equals(this.getId_number())){
                        if(this.getPassword1()==null||this.getPassword1().length()==0){
                            JOptionPane.showMessageDialog(null,"登录密码不允许为空！");
                            addFieldError("password1","");
                        }else if(this.getPassword2()==null||this.getPassword2().length()==0){
                            JOptionPane.showMessageDialog(null,"重复密码不允许为空！");
                            addFieldError("password2","");
                        }else if(this.getPassword1().length() != 6){
                            JOptionPane.showMessageDialog(null,"登录密码需设定为6位数字，请重新设置！");
                            addFieldError("password1","");
                        }else if(!this.getPassword1().equals(this.getPassword2())){
                            JOptionPane.showMessageDialog(null,"两次密码不一致，请认真核对！");
                            addFieldError("password2","");
                        }else{
                            for(int i = 0; i < 6; i++){
                                if(this.getPassword1().toCharArray()[i] > '9' || this.getPassword1().toCharArray()[i] < '0'){
                                    JOptionPane.showMessageDialog(null,"登录密码必须为数字，请重新设置！");
                                    addFieldError("password1","");
                                    break;
                                }
                            }    
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "身份证号不正确！");
                        addFieldError("id_number","");
                    }
                }
            }     
        }
        
    }
    
    
    public UserPO user(){
        GetDao gd = new GetDao();
        list=gd.queryInfo("account_number", this.getAccount_number());
        UserPO userPO= (UserPO)list.get(0);
        userPO.setPassword(this.getPassword1());
        return userPO;
    }
   public String execute() throws Exception{
        GetDao gt = new GetDao();
        boolean ri=gt.updateInfo(user());
        if(ri){
            mess="success";
        }
        return mess;
    }
}
