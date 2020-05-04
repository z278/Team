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
 * @author 史一然
 */
public class LookAction extends ActionSupport{
    private String bId;
    private String mess="error";
    private List list;
    private HttpServletRequest request;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }
   public String execute() throws Exception{
        LoginRegisterInfo lr=new LoginRegisterInfo();
        request=ServletActionContext.getRequest();
        List list=lr.queryInfo("bId", this.getbId());
        request.getSession().setAttribute("lookInfo", list);
        mess="success";
        return mess;
    }
}
