/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import PO.UserPO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.swing.JOptionPane;
import loginRegisterDao.LoginRegisterInfo;
import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author hp
 */
public class SetAction extends ActionSupport{
    private String bId;
    private double setMoney;
    private String mess="error";
    private List list;
    private HttpServletRequest request;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public double getSetMoney() {
        return setMoney;
    }

    public void setSetMoney(double getMoney) {
        this.setMoney = getMoney;
    }
    
    public void validate(){
        if(this.setMoney < 0){
            addFieldError("getMoney","输入存款数不能是负数");
        }
        
    }
    
    public UserPO user(){
        LoginRegisterInfo info=new LoginRegisterInfo();
        list=info.queryInfo("bId", this.getbId());
        UserPO userPO= (UserPO)list.get(0); 
        userPO.setMoney(userPO.getMoney()+this.setMoney);
        return userPO;
    }
   public String execute() throws Exception{
        LoginRegisterInfo lr=new LoginRegisterInfo();
        boolean update=lr.updateInfo(user());
        request=ServletActionContext.getRequest();
        List list=lr.queryInfo("bId", this.getbId());
        request.getSession().setAttribute("oneInfo", list);
        if(update){
            mess="success";
        }
        return mess;
    }
    public void message(String mess){
        int type=JOptionPane.YES_NO_OPTION;
        String title="提示信息";
        JOptionPane.showMessageDialog(null, mess, title, type);
    }
}