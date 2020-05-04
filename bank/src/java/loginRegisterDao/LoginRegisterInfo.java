/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginRegisterDao;

import sessionFactory.HibernateSessionFactory;
import PO.UserPO;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.query.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;

/**
 *
 * @author hp
 */
public class LoginRegisterInfo {
    private Session session;
    private Transaction transaction;
    private Query query;
    HibernateSessionFactory getSession;
    public String saveInfo(UserPO info){
        String mess="error";
        getSession=new HibernateSessionFactory();
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            session.save(info);
            transaction.commit();
            mess="success";
            return mess;
        }catch(Exception e){
            message("RegisterInfo.error:"+e);
            e.printStackTrace();
            return null;
        }
    }

    public List queryInfo(String type, String value) {
        getSession = new HibernateSessionFactory();
        session=getSession.getSession();
        try{
            String hqlsql = "from UserPO as u where u.bId=?";
            query = session.createQuery(hqlsql);
            query.setParameter(0,value);
            List list = query.list();
            transaction = session.beginTransaction();
            transaction.commit();
            return list;
        }catch(Exception e){
            message("LoginRegisterInfo类中有异常，异常为："+e);
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean updateInfo(UserPO info){
        try{
            session = HibernateSessionFactory.getSession();
            transaction = session.beginTransaction();
            session.update(info);
            transaction.commit();
            session.close();
            return true;
        } catch(Exception e){
            message("updateInfo.error:"+e);
            e.printStackTrace();
            return false;
        }
        
    }
    
    public void message(String mess){
        int type = JOptionPane.YES_NO_OPTION;
        String title = "提示信息";
        JOptionPane.showMessageDialog(null,mess,title,type);
                
    }
}
