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
    public static List<Users> LaydanhsachTaiKhoan(String tendn){
        List<Users> list=null;
        Session session=HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();
        String sql="from Dangnhap";
        if(tendn.length()>0){
            sql +=" where tentaikhoan like '%"+tendn+"'%";
        }
        
        
        Query query=session.createQuery(sql);
        list=query.list();
        session.close();
        return list;
    }

    public DangNhapDao() {
    }
    
    public  static Users timkiemTaiKhoan(String tendn){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        Users tk=(Users) session.get(Users.class, tendn);
        session.close();
        return tk;
    }
    
    public static boolean xoaTaikhoan(String tendn){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Users tk=(Users) session.get(Users.class, tendn);
        if(tk==null){
            return false;
        }
        try {
            session.getTransaction().begin();
            session.delete(tk);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return false;
        }
        finally{
            session.close();
        }
    }
    
    
    
    
    
    public  static  boolean  themTaikhoan( Users tk){
        if(DangNhapDao.timkiemTaiKhoan((String) tk.getTentaikhoan())!=null){
            return false;
        }
        Session session =HibernateUtil.getSessionFactory().openSession();
        try {
            session.getTransaction().begin();
            session.save(tk);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            
            session.getTransaction().rollback();
            return false;
            
        }
        finally{
            session.close();
        }
        
        
    }
    
    
    public  static boolean  capnhatTaiKhoan(Users tk){
        Session session=HibernateUtil.getSessionFactory().openSession();
        if(tk==null){
            return false;
        }
        
        
        try {
            session.getTransaction().begin();
            session.update(tk);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return false;
        }
        finally{
            session.close();
        }
    }
    
    
  
    
    
    
    public static void main(String[] args) {
        Users tk=new Users("admin", "Admin", "admin");
        
        if(themTaikhoan(tk)){
            System.out.println("ok");
        }
        else {
            System.out.println("no");
        }
    }
}


