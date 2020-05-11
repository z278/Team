/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.AccountDao;
import entity.Account;
import java.util.List;

/**
 *
 * @author syr
 */
public class Numberborn extends ActionSupport {
    private String account_number;
    private String cPass1;
    private String cPass2;
    private String mess="error";
    private List list;
    public String getaccount_number(){
        return this.account_number;
    }
    public void setaccount_number(String account_number){
        this.account_number=account_number;
    }    
    public String getcPass1(){
        return this.cPass1;
    }
    public void setcPass1(String cPass1){
        this.cPass1=cPass1;
    }
       public String getcPass2(){
        return this.cPass2;
    }
    public void setcPass2(String cPass2){
        this.cPass2=cPass2;
    }

    public void validate(){
        if(this.getaccount_number()==null||this.getaccount_number().length()==0){
            addFieldError("account_number","520"+(int)((Math.random()*9+1)*100000)+"该号码串为账号！");
        }else{
            AccountDao info=new AccountDao();
            list=info.queryInfo("account_number", this.getaccount_number());
            Account ui=new Account();
            for(int i=0;i<list.size();i++){
                ui=(Account)list.get(i);
                if(ui.getaccount_number().equals(this.getaccount_number())){
                    addFieldError("account_number","该账号已存在，请将用户账号栏清空并点击提交，您将会得到新的账号！");
                }
            }
        }
        
        if(this.getcPass1()==null||this.getcPass1().length()==0){
            addFieldError("cPass1","登录密码不允许为空！");
        }else if(this.getcPass2()==null||this.getcPass2().length()==0){
            addFieldError("cPass2","重复密码不允许为空！");
        }else if(this.getcPass1().length() != 6){
            addFieldError("cPass1","登录密码需设定为6位数字，请重新设置！");
        }else if(!this.getcPass1().equals(this.getcPass2())){
            addFieldError("cPass2","两次密码不一致，请认真核对！");
        }else{
            for(int i = 0; i < 6; i++){
                if(this.getcPass1().toCharArray()[i] > '9' || this.getcPass1().toCharArray()[i] < '0'){
                    addFieldError("cPass1","登录密码必须为数字，请重新设置！");
                    break;
                }
            }    
        }
    }
    
    public Account account(){
        Account info=new Account();
        info.setaccount_number(this.getaccount_number());
        info.setpassword(this.getcPass1()); 
        return info;
    }
   public String execute() throws Exception{
        AccountDao lr=new AccountDao();
        String ri=lr.saveInfo(account());
        if(ri.equals("success")){
            mess="success";
        }
        return mess;
    }
}
