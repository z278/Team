
package action;

import com.opensymphony.xwork2.ActionSupport;
import loginRegisterDao.LoginRegisterInfo;
import PO.UserPO;
import com.opensymphony.xwork2.ActionContext;
import java.util.List;
import javax.swing.JOptionPane;

public class LoginAction extends ActionSupport{
    private String bId;
    private String cPass;
    private String message="error";
    private List list;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getcPass() {
        return cPass;
    }

    public void setcPass(String cPass) {
        this.cPass = cPass;
    }
    
    public void validate(){
        if(this.getbId()==null||this.getbId().length()==0){
            addFieldError("bId","账号不能为空！");
        }else{
            LoginRegisterInfo info=new LoginRegisterInfo();
            list=info.queryInfo("bId", this.getbId());
            if(list.size()==0){
                JOptionPane.showConfirmDialog(null, "该账号尚未注册！");
            }else{
                UserPO ui=new UserPO();
                int count=0;
                for(int i=0;i<list.size();i++){
                    count++;
                    ui=(UserPO)list.get(i);
                    if(this.getbId().equals(ui.getbId())){
                        if(ui.getcPass().equals(this.getcPass())){
                            message="success";
                        }else{
                            JOptionPane.showConfirmDialog(null, "登录密码不正确！");
                        }
                    }
                }
            }
        }
    }
    public String execute() throws Exception{
        ActionContext ac = ActionContext.getContext();
        ac.getApplication().put("bId", this.getbId());
        ac.getSession().put("bId", this.getbId());
        return message;
    }
}
