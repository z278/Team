/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.UserPO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import tdao.GetDao;

/**
 *
 * @author 史一然
 */
public class Register extends ActionSupport{
    private String id_number;
    private String myphone;
    private String username;
    private double money;
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

    public String getMyphone() {
        return myphone;
    }

    public void setMyphone(String myphone) {
        this.myphone = myphone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
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
        
        if(this.getId_number()==null||this.getId_number().length()==0){
            JOptionPane.showMessageDialog(null,"身份证号不能为空！");
            addFieldError("id_number","");
        }else if(this.getId_number().length() != 18){
            JOptionPane.showMessageDialog(null,"身份证号长度不正确，请认真核对！");
            addFieldError("id_number","");
        }else{
            GetDao gt = new GetDao();
            list=gt.queryInfo("id_number", this.getId_number());
            UserPO ui=new UserPO();
            for(int i=0;i<list.size();i++){
                ui=(UserPO)list.get(i);
            }
        }
        
        if(this.getMyphone()==null||this.getMyphone().length()==0){
            JOptionPane.showMessageDialog(null,"电话号码不能为空！");
            addFieldError("myphone","");
        }else if(this.getMyphone().length() != 11){
            JOptionPane.showMessageDialog(null,"电话号码长度不正确，请认真核对！");
            addFieldError("myphone","");
        }else{
            GetDao gt = new GetDao();
            list=gt.queryInfo("myphone", this.getMyphone());
            UserPO ui=new UserPO();
            for(int i=0;i<list.size();i++){
                ui=(UserPO)list.get(i);
            }
        }
        
        if(this.getUsername()==null||this.getUsername().length()==0){
            JOptionPane.showMessageDialog(null,"用户姓名不能为空！");
            addFieldError("username","");
        }else{
            GetDao gt = new GetDao();
            list=gt.queryInfo("username", this.getUsername());
            UserPO ui=new UserPO();
            for(int i=0;i<list.size();i++){
                ui=(UserPO)list.get(i);
            }
        }
        
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
    }
    
    public UserPO user(){
        UserPO info=new UserPO();
        info.setId_number(this.getId_number());
        info.setMyphone(this.getMyphone());
        info.setUsername(this.getUsername());
        info.setPassword(this.getPassword1());
        info.setMoney(0.0);
        Date date = new Date();
        info.setDate(date);
        String account_number = "520"+(int)(Math.random()*9+1)*100000;
        info.setAccount_number(account_number);
        return info;
    }
   public String execute() throws Exception{
        GetDao gt = new GetDao();
        String ri=gt.saveInfo(user());
        if(ri.equals("success")){
            mess="success";
        }
        return mess;
    }
}
