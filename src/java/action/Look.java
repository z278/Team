/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import entity.Account;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.swing.JOptionPane;
import dao.AccountDao;
import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author 史一然
 */
public class Look extends ActionSupport{
    private String account_number;
    private String mess="error";
    private List list;
    private HttpServletRequest request;

    public String getaccount_number() {
        return account_number;
    }

    public void setaccount_number(String account_number) {
        this.account_number = account_number;
    }
   public String execute() throws Exception{
        AccountDao lr=new AccountDao();
        request=ServletActionContext.getRequest();
        List list=lr.queryInfo("account_number", this.getaccount_number());
        request.getSession().setAttribute("lookInfo", list);
        mess="success";
        return mess;
    }
}
