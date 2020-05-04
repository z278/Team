/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

/**
 *
 * @author syr
 */

import PO.UserPO;
import com.opensymphony.xwork2.ActionSupport;
import loginRegisterDao.LoginRegisterInfo;
import java.util.List;

public class RegisterAction extends ActionSupport{
    private String bId;
    private String cPass1;
    private String cPass2;
    private String cId;
    private String phone;
    private String name;
    private String mess="error";
    private List list;
    public String getbId(){
        return this.bId;
    }
    public void setbId(String bId){
        this.bId=bId;
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
    public String getcId(){
        return this.cId;
    }
    public void setcId(String cId){
        this.cId=cId;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
     public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void validate(){
        if(this.getbId()==null||this.getbId().length()==0){
            addFieldError("bId","请将此号码串"+"520"+(int)((Math.random()*9+1)*100000)+"填入用户账号栏，该号码串为您的账号！");
        }else{
            LoginRegisterInfo info=new LoginRegisterInfo();
            list=info.queryInfo("bId", this.getbId());
            UserPO ui=new UserPO();
            for(int i=0;i<list.size();i++){
                ui=(UserPO)list.get(i);
                if(ui.getbId().equals(this.getbId())){
                    addFieldError("bId","该账号已存在，请将用户账号栏清空并点击提交，您将会得到新的账号！");
                }
            }
        }
        
        if(this.getcId()==null||this.getcId().length()==0){
            addFieldError("cId","身份证号不能为空！");
        }else if(this.getcId().length() != 18){
            addFieldError("cId","身份证号长度不正确，请认真核对！");
        }else{
            LoginRegisterInfo info=new LoginRegisterInfo();
            list=info.queryInfo("cId", this.getcId());
            UserPO ui=new UserPO();
            for(int i=0;i<list.size();i++){
                ui=(UserPO)list.get(i);
            }
        }
        
        if(this.getPhone()==null||this.getPhone().length()==0){
            addFieldError("phone","电话号码不能为空！");
        }else if(this.getPhone().length() != 11){
            addFieldError("phone","电话号码长度不正确，请认真核对！");
        }else{
            LoginRegisterInfo info=new LoginRegisterInfo();
            list=info.queryInfo("phone", this.getPhone());
            UserPO ui=new UserPO();
            for(int i=0;i<list.size();i++){
                ui=(UserPO)list.get(i);
            }
        }
        
        if(this.getName()==null||this.getName().length()==0){
            addFieldError("name","用户姓名不能为空！");
        }else{
            LoginRegisterInfo info=new LoginRegisterInfo();
            list=info.queryInfo("name", this.getName());
            UserPO ui=new UserPO();
            for(int i=0;i<list.size();i++){
                ui=(UserPO)list.get(i);
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
    public UserPO user(){
        UserPO info=new UserPO();
        info.setbId(this.getbId());
        info.setcId(this.getcId());
        info.setPhone(this.getPhone());
        info.setName(this.getName());
        info.setcPass(this.getcPass1()); 
        return info;
    }
   public String execute() throws Exception{
        LoginRegisterInfo lr=new LoginRegisterInfo();
        String ri=lr.saveInfo(user());
        if(ri.equals("success")){
            mess="success";
        }
        return mess;
    }
}

