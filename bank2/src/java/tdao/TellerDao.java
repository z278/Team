/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdao;

import entity.Teller;
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
public class TellerDao {
    private Session session;
    private Transaction transaction;
    private Query query;
    HibernateSessionFactory getSession;
    
    public List queryInfo(String type, String value){
        getSession = new HibernateSessionFactory();
        session=getSession.getSession();
        try{
            String hqlsql = "from Teller as u where u.username=?";
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
    
    public boolean deleteInfo(int id){
        try{
            session=HibernateSessionFactory.getSession();
            transaction=session.beginTransaction();
            Teller info=new Teller();
            info=(Teller)session.get(Teller.class, new Integer(id));
            session.delete(info);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            message("deleteInfo.error:"+e);
            e.printStackTrace();
            return false;
        }
    }
    
    public String saveInfo(Teller info){
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
            message("RecordDao.error:"+e);
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean updateInfo(Teller info){
        try{
            session = HibernateSessionFactory.getSession();
            transaction = session.beginTransaction();
            session.update(info);
            transaction.commit();
            session.close();
            return true;
        } catch(Exception e){
            message("RecordDao.error:"+e);
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
