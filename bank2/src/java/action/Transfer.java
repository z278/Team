/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.Record;
import entity.UserPO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import tdao.GetDao;
import tdao.RecordDao;

/**
 *
 * @author hp
 */
public class Transfer extends ActionSupport{
    private String account_number1;
    private String account_number2;
    private String password;
    private double money;
    
    private String mess="input";
    private List list1;
    private List list2;

    public String getAccount_number1() {
        return account_number1;
    }

    public void setAccount_number1(String account_number1) {
        this.account_number1 = account_number1;
    }

    public String getAccount_number2() {
        return account_number2;
    }

    public void setAccount_number2(String account_number2) {
        this.account_number2 = account_number2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    public void validate(){
        if(this.getAccount_number1()==null||this.getAccount_number1().length()==0){
            JOptionPane.showMessageDialog(null, "转账账号不能为空！");
        }else{
            GetDao gd = new GetDao();
            list1=gd.queryInfo("account_number1", this.getAccount_number1());
            if(list1==null || list1.size()==0){
                JOptionPane.showMessageDialog(null, "转账账号尚未注册！");
            }else{
                if(this.getAccount_number2()==null||this.getAccount_number2().length()==0){
                    JOptionPane.showMessageDialog(null, "收账账号不能为空！");
                }else{
                    list2=gd.queryInfo("account_number2", this.getAccount_number2());
                    if(list2==null || list2.size()==0){
                        JOptionPane.showMessageDialog(null, "收账账号尚未注册！");
                    }else{
                        UserPO userPO1= (UserPO)list1.get(0);
                        if(userPO1.getAccount_number().equals(this.getAccount_number1())){
                            if(userPO1.getPassword().equals(this.getPassword())){
                                if(this.money <= 0){
                                    JOptionPane.showMessageDialog(null, "输入取款数不是正数");
                                }else {
                                    int is = JOptionPane.showConfirmDialog(null, "你转账"+this.money, "提示", JOptionPane.YES_NO_CANCEL_OPTION);
                                    if(is == JOptionPane.YES_OPTION){
                                        userPO1.setMoney(userPO1.getMoney()-this.money);
                                        boolean update1=gd.updateInfo(userPO1);
                                        UserPO userPO2= (UserPO)list2.get(0);
                                        userPO2.setMoney(userPO2.getMoney()+this.money);
                                        boolean update2=gd.updateInfo(userPO2);
                                        if(update1&&update2){
                                            mess="success";
                                        }
                                        RecordDao recordDao = new RecordDao();
                                        Record record = new Record();
                                        record.setType("转账");
                                        record.setMoney(this.money);
                                        record.setAccount_number(this.account_number1);
                                        Date date = new Date();
                                        record.setDate(date);
                                        recordDao.saveInfo(record);
                                        
                                        Record record1 = new Record();
                                        record1.setType("收账");
                                        record1.setMoney(this.money);
                                        record1.setAccount_number(this.account_number2);
                                        Date date1 = new Date();
                                        record1.setDate(date1);
                                        recordDao.saveInfo(record1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "登录密码不正确！");
                            }
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
