/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.*;
import Entity.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dell
 */
public class NhanVienDao {

  public static List<Nhanvien> danhsachNhanVien(String manv) {
        List<Nhanvien> list = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();
        String sql = "from nhanvien";
        if (manv.length() > 0) {
            sql += " " + manv;
        }
        Query query = session.createQuery(sql);
        list = query.list();
 session.close();

        return list;
    }

    public static Nhanvien timkiemNhanVien(String manv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        Nhanvien nv = (Nhanvien) session.get(Nhanvien.class, manv);

        session.close();
        return nv;

    }

    public static List<Nhanvien> search(String name) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Nhanvien.class);
        if (name != null) {
            criteria.add(Restrictions.like("hoten", "%" + name + "%"));
        }
        List<Nhanvien> result = criteria.list();
        //session.close();
        // sessionFactory.close();
        return result;
    }

    public static boolean themnhanvien(Nhanvien nv) {
        if (NhanVienDao.timkiemNhanVien((String) nv.getMaNhanVien()) != null) {
            return false;
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.getTransaction().begin();
            session.save(nv);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return false;
        } finally {
            session.close();
        }

    }

    public static boolean xoaNhanvien(String manv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Nhanvien nv = NhanVienDao.timkiemNhanVien(manv);
        if (nv == null) {
            return false;
        }
        try {
            session.getTransaction().begin();
            session.delete(nv);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();

            return false;
        } finally {
            session.close();
        }

    }

    public static boolean capnhatNhanVien(Nhanvien nv) {
        if (nv == null) {
            return false;
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.getTransaction().begin();
            session.update(nv);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public static void main(String[] args) {
        try {
            Date a = new SimpleDateFormat("yyyy-MM-dd").parse("1996-01-02");

            Nhanvien nv = new Nhanvien("NV01", "Nguyen Ngoc thien", "Nam", "1996-01-02","0963456789","123 Cầu giấy","Nhân viên kho", "9.500.000","thien@gmail.com");
            boolean xoa = capnhatNhanVien(nv);
            if (xoa) {
                System.out.println("ok");
            } else {
                System.out.println("false");
            }
        } catch (ParseException ex) {
            Logger.getLogger(NhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
