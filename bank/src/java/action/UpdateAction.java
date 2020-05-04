/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;
import loginRegisterDao.LoginRegisterInfo;
import PO.UserPO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;
import org.apache.struts2.ServletActionContext;
/**
 *
 * @author 标哥！
 */
public class UpdateAction extends ActionSupport{
    private String bId;
    private String cPass1;
    private String cPass2;
    private List list;
    private HttpServletRequest request;
    private String mess="error";

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getcPass1() {
        return cPass1;
    }

    public void setcPass1(String cPass1) {
        this.cPass1 = cPass1;
    }

    public String getcPass2() {
        return cPass2;
    }

    public void setcPass2(String cPass2) {
        this.cPass2 = cPass2;
    }

    public void validate(){
        if(this.getbId()==null||this.getbId().length()==0){
            addFieldError("bId","用户名不允许为空！");
        }
        else{
            LoginRegisterInfo info = new LoginRegisterInfo();
            list=info.queryInfo("bId", this.getbId());
            UserPO ui = new UserPO();
            for(int i = 0;i < list.size();i++){
                ui = (UserPO)list.get(i);
                if(ui.getbId().equals(this.getbId())){
                    if(this.getcPass1() == null || this.getcPass1().length()==0){
                        addFieldError("cPass1","新密码不允许为空！");
                    }else if(this.getcPass2()==null||this.getcPass2().length()==0){
                        addFieldError("cPass2","重复密码不允许为空！");
                    }else if(!this.getcPass1().equals(this.getcPass2())){
                        addFieldError("cPass2","两次密码不一致！");
                    }
                }
                else{
                    addFieldError("bId","用户名不存在！");
                }
            }
        }
    }
    
    public UserPO info(){
        LoginRegisterInfo info=new LoginRegisterInfo();
        list=info.queryInfo("bId",this.getbId());
        UserPO userPO= (UserPO)list.get(0); 
        
        userPO.setcPass(this.getcPass1());
        return userPO;
    }
    
    public String execute() throws Exception{
        LoginRegisterInfo lr=new LoginRegisterInfo();
        boolean update=lr.updateInfo(info());
        request=ServletActionContext.getRequest();
        List list=lr.queryInfo("bId",this.getbId());
        request.getSession().setAttribute("oneInfo",list);
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
