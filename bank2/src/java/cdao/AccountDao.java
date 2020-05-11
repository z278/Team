/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdao;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import sessionFactory.HibernateSessionFactory;

/**
 *
 * @author hp
 */
public class AccountDao {
    private Session session;
    private Transaction transaction;
    private Query query;
    HibernateSessionFactory getSession;
    public List queryInfo(String type, String value) {
        getSession = new HibernateSessionFactory();
        session=getSession.getSession();
        try{
            String hqlsql = "from Account as u where u.username=?";
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
    
    public void message(String mess){
        int type = JOptionPane.YES_NO_OPTION;
        String title = "提示信息";
        JOptionPane.showMessageDialog(null,mess,title,type);
                
    }
}
