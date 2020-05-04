
package action;

import PO.UserPO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.swing.JOptionPane;
import loginRegisterDao.LoginRegisterInfo;

/**
 *
 * @author hp
 */
public class ForgotAction extends ActionSupport{
    private String bId;
    private String cId;
    
    private String mess="error";
    private List list;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }
    
    public void validate(){
        LoginRegisterInfo info=new LoginRegisterInfo();
        list=info.queryInfo("bId", this.getbId());
        if(this.getbId()==null||this.getbId().length()==0){
            addFieldError("bId","账号不能为空！");
        }else{
            if(list.size()==0){
                JOptionPane.showConfirmDialog(null, "该账号尚未注册！");
            }
        }
        
        
        UserPO userPO= (UserPO)list.get(0);
        
        if(!userPO.getcId().equals(this.getcId())){
            addFieldError("cId","身份证号不正确，请重新输入！");
        }
    }
    
    public String execute() throws Exception{
        ActionContext ac = ActionContext.getContext();
        ac.getApplication().put("bId", this.getbId());
        ac.getSession().put("bId", this.getbId());
        LoginRegisterInfo info=new LoginRegisterInfo();
        list=info.queryInfo("bId", this.getbId());
        UserPO userPO= (UserPO)list.get(0);
        if(userPO.getcId().equals(this.getcId())){
            mess="success";
        }
        
        return mess;
    }
}
