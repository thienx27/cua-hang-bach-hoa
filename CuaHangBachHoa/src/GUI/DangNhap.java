/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DangNhapDao;
import Entity.Users;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DangNhap extends javax.swing.JFrame implements interdangnhap {

    String matkhau;
    String tendangnhap;
    String chucnang;

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icon = new ImageIcon("src\\image\\lpgin2.png");
        java.awt.Image image = icon.getImage();
        ImageIcon icon1 = new ImageIcon(image.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), image.SCALE_SMOOTH));
        jLabel1.setIcon(icon1);

        /////////////////////
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_taikhoan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_matkhau = new javax.swing.JPasswordField();
        btn_dangnhap = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setFont(new java.awt.Font("Adobe Arabic", 0, 36)); // NOI18N

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("ĐĂNG NHẬP");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 100, 230, 50);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Tên tài khoản:");
        jLabel2.setPreferredSize(new java.awt.Dimension(90, 40));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 180, 180, 40);

        txt_taikhoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_taikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_taikhoanActionPerformed(evt);
            }
        });
        jPanel1.add(txt_taikhoan);
        txt_taikhoan.setBounds(230, 180, 270, 40);

        jLabel4.setBackground(new java.awt.Color(51, 0, 51));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Mật khẩu:");
        jLabel4.setToolTipText("");
        jLabel4.setPreferredSize(new java.awt.Dimension(90, 40));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 250, 125, 40);

        txt_matkhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txt_matkhau);
        txt_matkhau.setBounds(230, 250, 270, 40);

        btn_dangnhap.setBackground(new java.awt.Color(255, 255, 255));
        btn_dangnhap.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_dangnhap.setForeground(new java.awt.Color(51, 51, 51));
        btn_dangnhap.setText("Đăng nhập");
        btn_dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangnhapActionPerformed(evt);
            }
        });
        jPanel1.add(btn_dangnhap);
        btn_dangnhap.setBounds(210, 320, 121, 33);

        btn_thoat.setBackground(new java.awt.Color(255, 255, 255));
        btn_thoat.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_thoat.setForeground(new java.awt.Color(51, 51, 51));
        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });
        jPanel1.add(btn_thoat);
        btn_thoat.setBounds(360, 320, 120, 33);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_taikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_taikhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_taikhoanActionPerformed

    private void btn_dangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangnhapActionPerformed
        // TODO add your handling code here:
        if (kiemtradulieu()) {
            new FrmMain(chucnang, txt_taikhoan.getText()).setVisible(true);
            setVisible(false);
            dispose();
        }
        

    }//GEN-LAST:event_btn_dangnhapActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_thoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dangnhap;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_matkhau;
    private javax.swing.JTextField txt_taikhoan;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean kiemtradulieu() {
        if (txt_taikhoan.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Xin mời nhập tên tài khoản ", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (txt_taikhoan.getText().length() > 20 || txt_taikhoan.getText().length() < 0) {

            JOptionPane.showMessageDialog(null, " Tên tài khoản chỉ nhập từ 1 đến 20 ký tự", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;

        } else if (!txt_taikhoan.getText().matches("[0-9a-zA-Z]+")) {

            JOptionPane.showMessageDialog(null, "Sai định dạng Tài khoản", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        matkhau = new String(txt_matkhau.getPassword());
        tendangnhap = txt_taikhoan.getText();
        if (matkhau.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Xin mời nhập Mật khẩu ", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (matkhau.length() > 20 || matkhau.length() < 1) {

            JOptionPane.showMessageDialog(null, "mật khẩu chỉ nhập từ 1 đến 20 ký tự ", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!matkhau.matches("[0-9a-zA-Z]+")) {

            JOptionPane.showMessageDialog(null, " Sai định dạng Mật khẩu", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        Users tk = DangNhapDao.timkiemTaiKhoan(tendangnhap);

        if (tk != null) {
            if (!matkhau.equals(tk.getMatkhau())) {
                JOptionPane.showMessageDialog(null, "Sai Mật Khẩu ", "Thông báo!", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Sai tên Tài Khoản ", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        chucnang = (String) tk.getChucnang();
        if (tk.getChucnang().equals("Quản lý")) {
            JOptionPane.showMessageDialog(rootPane, "Đăng Nhập Thành Công "
                    + "\n Xin chào Quản Lý : " + tk.getTentaikhoan());
        } else {
            if (tk.getChucnang().equals("Nhân viên")) {
                JOptionPane.showMessageDialog(rootPane, "Đăng Nhập Thành Công  "
                        + "\n Xin chào Nhân viên : " + tk.getTentaikhoan());
            }
        }

        return true;
    }
}
