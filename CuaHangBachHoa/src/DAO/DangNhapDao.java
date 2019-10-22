/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.*;
import Entity.*;
import org.hibernate.*;
/**
 *
 * @author Dell
 */
public class DangNhapDao {
    private final SessionFactory sf = HibernateUtil.getSessionFactory();
    public  List<Users> danhsach(){
        try {
            sf.getCurrentSession().beginTransaction();
            return sf.getCurrentSession().createCriteria(Users.class).list();
        } catch (Exception e) {
            return null;
        }
    }
     public  static Users timkiemTaiKhoan(String tendn){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        Users tk=(Users) session.get(Users.class, tendn);
        session.close();
        return tk;
    }
}


