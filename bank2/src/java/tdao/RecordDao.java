/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdao;

import entity.Record;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import sessionFactory.HibernateSessionFactory;



/**
 *
 * @author hp
 */
public class RecordDao {
    private Session session;
    private Transaction transaction;
    private Query query;
    HibernateSessionFactory getSession;
    
    public String saveInfo(Record r){
        String mess="error";
        getSession=new HibernateSessionFactory();
        session=HibernateSessionFactory.getSession();
        try{
            transaction=session.beginTransaction();
            session.save(r);
            transaction.commit();
            mess="success";
            return mess;
        }catch(Exception e){
            message("RecordDao.error:"+e);
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
