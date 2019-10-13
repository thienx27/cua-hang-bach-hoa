/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author Dell
 */
public class FrmMain extends javax.swing.JFrame {

    FrmDangNhap frmDangNhap;
    FrmQuanLyNhanVien frmnhanvien;
    FrmQuanLyHangHoa frmhanghoa;
    FrmHoaDon frmhoadon;

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnDangnhap = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnNhanVien = new javax.swing.JMenuItem();
        mnHangHoa = new javax.swing.JMenuItem();
        mnHoaDon = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenu3.setText("Hệ thống");

        mnDangnhap.setText("Đăng nhập");
        mnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDangnhapActionPerformed(evt);
            }
        });
        jMenu3.add(mnDangnhap);
        jMenu3.add(jSeparator1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Chức năng");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        mnNhanVien.setText("Quản lý nhân viên ");
        mnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNhanVienActionPerformed(evt);
            }
        });
        jMenu4.add(mnNhanVien);

        mnHangHoa.setText("Quản lý hàng hóa");
        mnHangHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHangHoaActionPerformed(evt);
            }
        });
        jMenu4.add(mnHangHoa);

        mnHoaDon.setText("Quản lý hóa đơn");
        mnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHoaDonActionPerformed(evt);
            }
        });
        jMenu4.add(mnHoaDon);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDangnhapActionPerformed
        for (JInternalFrame internalFrm : jDesktopPane1.getAllFrames()) {
            internalFrm.dispose();

        }
        if (frmDangNhap == null || frmDangNhap.isClosed()) {
            frmDangNhap = new FrmDangNhap();
            frmDangNhap.addInternalFrameListener(new InternalFrameListener() {
                @Override
                public void internalFrameOpened(InternalFrameEvent ife) {

                }

                @Override
                public void internalFrameClosing(InternalFrameEvent ife) {

                }

                @Override
                public void internalFrameClosed(InternalFrameEvent ife) {
                    mnDangnhap.setText("logout");

                }

                @Override
                public void internalFrameIconified(InternalFrameEvent ife) {

                }

                @Override
                public void internalFrameDeiconified(InternalFrameEvent ife) {
                }

                @Override
                public void internalFrameActivated(InternalFrameEvent ife) {
                    mnDangnhap.setText("login");

                }

                @Override
                public void internalFrameDeactivated(InternalFrameEvent ife) {

                }

            }
            );
            jDesktopPane1.add(frmDangNhap);
            frmDangNhap.setLocation(this.getWidth() / 2 - frmDangNhap.getWidth() / 2,
                    this.getHeight() / 2 - frmDangNhap.getHeight() / 2);
            frmDangNhap.setVisible(true);

        } else {

            frmDangNhap.setVisible(true);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_mnDangnhapActionPerformed

    private void mnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNhanVienActionPerformed
//        if (frmnhanvien == null || frmnhanvien.isClosed()) {
//            frmnhanvien = new FrmQuanLyNhanVien();
//            jDesktopPane1.add(frmnhanvien);
//            frmnhanvien.setLocation(this.getWidth() / 2 - frmnhanvien.getWidth() / 2,
//                    this.getHeight() / 2 - frmnhanvien.getHeight() / 2);
//            frmnhanvien.setVisible(true);
//
//        } else {
//
//            frmnhanvien.setVisible(true);
//        }

    }//GEN-LAST:event_mnNhanVienActionPerformed

    private void mnHangHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHangHoaActionPerformed
//        if (frmhanghoa == null || frmhanghoa.isClosed()) {
//            frmhanghoa = new frmQuanLyHangHoa();
//            jDesktopPane1.add(frmhanghoa);
//            frmhanghoa.setLocation(this.getWidth() / 2 - frmhanghoa.getWidth() / 2,
//                    this.getHeight() / 2 - frmhanghoa.getHeight() / 2);
//            frmhanghoa.setVisible(true);
//
//        } else {
//
//            frmhanghoa.setVisible(true);
//        }


    }//GEN-LAST:event_mnHangHoaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(1); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void mnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHoaDonActionPerformed
//        if (frmhoadon == null || frmhoadon.isClosed()) {
//            frmhoadon = new FrmHoaDon();
//            jDesktopPane1.add(frmhoadon);
//            frmhoadon.setLocation(this.getWidth() / 2 - frmhoadon.getWidth() / 2,
//                    this.getHeight() / 2 - frmhoadon.getHeight() / 2);
//            frmhoadon.setVisible(true);
//
//        } else {
//
//            frmhanghoa.setVisible(true);
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_mnHoaDonActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnDangnhap;
    private javax.swing.JMenuItem mnHangHoa;
    private javax.swing.JMenuItem mnHoaDon;
    private javax.swing.JMenuItem mnNhanVien;
    // End of variables declaration//GEN-END:variables
}