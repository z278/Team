/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

/**
 *
 * @author 史一然
 */

import entity.Depositor;
import com.opensymphony.xwork2.ActionSupport;
import dao.DepositorDao;
import java.util.List;

public class Register extends ActionSupport{
    private String phone;
    private String name;
    private String id_number;
    private String address;
    private String mess="error";
    private List list;
    
    public String getid_number(){
        return this.id_number;
    }
    public void setid_number(String id_number){
        this.id_number=id_number;
    }    
    public String getaddress(){
        return this.address;
    }
    public void setaddress(String address){
        this.address=address;
    }    
    
    public String getphone(){
        return this.phone;
    }
    public void setphone(String phone){
        this.phone=phone;
    }
    
     public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name=name;
    }
    
    public void validate(){
        if(this.getid_number()==null||this.getid_number().length()==0){
            addFieldError("id_number","身份证号不能为空！");
        }else if(this.getid_number().length() != 18){
            addFieldError("id_number","身份证号长度不正确，请认真核对！");
        }else{
            DepositorDao info=new DepositorDao();
            list=info.queryInfo("id_number", this.getid_number());
            Depositor ui=new Depositor();
            for(int i=0;i<list.size();i++){
                ui=(Depositor)list.get(i);
            }
        }
        
         if(this.getphone()==null||this.getphone().length()==0){
            addFieldError("phone","电话号码不能为空！");
        }else if(this.getphone().length() != 11){
            addFieldError("phone","电话号码长度不正确，请认真核对！");
        }else{
            DepositorDao info=new DepositorDao();
            list=info.queryInfo("phone", this.getphone());
            Depositor ui=new Depositor();
            for(int i=0;i<list.size();i++){
                ui=(Depositor)list.get(i);
            }
        }
        
        if(this.getname()==null||this.getname().length()==0){
            addFieldError("name","用户姓名不能为空！");
        }else{
            DepositorDao info=new DepositorDao();
            list=info.queryInfo("name", this.getname());
            Depositor ui=new Depositor();
            for(int i=0;i<list.size();i++){
                ui=(Depositor)list.get(i);
            }
        }
        
        if(this.getaddress()==null||this.getaddress().length()==0){
            addFieldError("address","家庭住址不能为空！");
        }else{
            DepositorDao info=new DepositorDao();
            list=info.queryInfo("address", this.getaddress());
            Depositor ui=new Depositor();
            for(int i=0;i<list.size();i++){
                ui=(Depositor)list.get(i);
            }
        }
    }
    public Depositor depositor(){
        Depositor info=new Depositor();
        info.setid_number(this.getid_number());
        info.setphone(this.getphone());
        info.setname(this.getname());
        info.setaddress(this.getaddress()); 
        return info;
    }
   public String execute() throws Exception{
        DepositorDao lr=new DepositorDao();
        String ri=lr.saveInfo(depositor());
        if(ri.equals("success")){
            mess="success";
        }
        return mess;
    }
}

