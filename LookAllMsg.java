/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aAction;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import tdao.TellerDao;

/**
 *
 * @author syr
 */
public class LookAllMsg extends ActionSupport{
     private HttpServletRequest request;
    private String message="input";
    public String execute() throws Exception{
        request=ServletActionContext.getRequest();
        TellerDao dao=new TellerDao();
        List list=dao.findAllInfo();
        request.getSession().setAttribute("count", list.size());
        request.getSession().setAttribute("allInfo", list);
        message="success";
        return message;
    }
}
