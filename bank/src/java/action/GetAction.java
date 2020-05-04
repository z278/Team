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
 * @author 张娜
 */
public class GetAction extends ActionSupport{
    private String bId;
    private double getMoney;
    private String mess="error";
    private List list;
    private HttpServletRequest request;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public double getGetMoney() {
        return getMoney;
    }

    public void setGetMoney(double getMoney) {
        this.getMoney = getMoney;
    }
    
    public void validate(){
        if(this.getMoney < 0){
            addFieldError("getMoney","输入取款数不能是负数");
        }
        LoginRegisterInfo info=new LoginRegisterInfo();
        list=info.queryInfo("bId", this.getbId());
        UserPO userPO= (UserPO)list.get(0);
        if(this.getMoney > userPO.getMoney()){
            addFieldError("getMoney","账号余额不够");
        }
    }
    
    public UserPO user(){
        LoginRegisterInfo info=new LoginRegisterInfo();
        list=info.queryInfo("bId", this.getbId());
        UserPO userPO= (UserPO)list.get(0); 
        userPO.setMoney(userPO.getMoney()-this.getMoney);
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
