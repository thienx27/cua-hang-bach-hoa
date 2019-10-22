/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entity.*;
import DAO.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import DAO.DangNhapDao;
import DAO.NhanVienDao;
import java.text.SimpleDateFormat;

/**
 *
 * @author Dell
 */
public class FrmQuanLyNhanVien extends javax.swing.JInternalFrame {

    private NhanVienDao NvDao = new NhanVienDao();
    JFileChooser c = new JFileChooser();
    List<Nhanvien> list;
    DefaultTableModel model;
    int index;

    /**
     * Creates new form FrmQuanLyNhanVien
     */
    public FrmQuanLyNhanVien() {
        initComponents();
        loadtable();
    }

//    private void LoadData() {
//        DefaultTableModel dft = new DefaultTableModel();
//        dft.addColumn("mã nhân viên");
//        dft.addColumn("Tên nhân viên");
//        dft.addColumn("Giới tính");
//        dft.addColumn("Ngày sinh");
//        dft.addColumn("Số điện thoại");
//        dft.addColumn("Địa chỉ");
//        dft.addColumn("Chức vụ");
//        dft.addColumn("Lương");
//        dft.addColumn("Email");
//
//        for (Nhanvien nv : this.NvDao.findAll()) {
//            dft.addRow(new Object[]{nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getGioitinh(),
//                nv.getNgaySinh(), nv.getSoDienThoai(), nv.getDiaChi(), nv.getChucVu(), nv.getLuong(), nv.getEmail()});
//        }
//        this.tblNhanVien.setModel(dft);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTenNhanVien = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_MaNhanVien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rboNam = new javax.swing.JRadioButton();
        rboNu = new javax.swing.JRadioButton();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbbChucVu = new javax.swing.JComboBox<>();
        txtLuong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý nhân viên");

        btnTimKiem.setText("Tìm kiếm");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã nhân viên");

        jLabel3.setText("Giới tính");

        jLabel4.setText("Số điện thoại");

        jLabel5.setText("Chức vụ");

        jLabel6.setText("Tên nhân viên");

        rboNam.setText("Nam");

        rboNu.setText("Nữ");

        jLabel7.setText("Ngày Sinh");

        jLabel8.setText("Địa chỉ");

        jLabel9.setText("Lương");

        cbbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý cửa hàng", "Nhân viên kho", "Nhân viên thu ngân", "Item 4" }));

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân viên", "Tên Nhân viên", "Giới tính", "Ngày sinh", "Số điện thoại", "Địa chỉ", "Chức vụ", "Lương", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        jLabel10.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_MaNhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbChucVu, 0, 159, Short.MAX_VALUE))
                                .addGap(64, 64, 64))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rboNam)
                                        .addGap(35, 35, 35)
                                        .addComponent(rboNu))
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTimKiem)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(33, 33, 33)
                                            .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDiaChi)
                                        .addComponent(txtLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(rboNam)
                    .addComponent(rboNu)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(cbbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.them();
//        NhanVienDao NvDao = new NhanVienDao();
        //        Nhanvien nv = new Nhanvien();
        //        nv.setMaNhanVien(this.txt_MaNhanVien.getText());
        //        nv.setTenNhanVien(this.txtTenNhanVien.getText());
        //        if (rboNam.isSelected()) {
        //            rboNam.setSelected(false);
        //        } else if (rboNu.isSelected()) {
        //            rboNu.setSelected(false);
        //        }
        //        nv.setNgaySinh(this.txtNgaySinh.getText());
        //       nv.setSoDienThoai(this.txtSoDienThoai.getColumns());
        //        nv.setDiaChi(this.txtDiaChi.getText());
        //        nv.setChucVu(this.cbbChucVu.getSelectedItem().toString());
        //       nv.setLuong(this.txtLuong.getColumns());
        //        if (NvDao.Save(nv)) {
        //            JOptionPane.showMessageDialog(null, "Thêm thành công");
        //        } else {
        //            JOptionPane.showMessageDialog(null, "Thêm thất bại");
        //        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.capnhat();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.xoa();        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbChucVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rboNam;
    private javax.swing.JRadioButton rboNu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txt_MaNhanVien;
    // End of variables declaration//GEN-END:variables

    public boolean checkdulieu() {
        if (txt_MaNhanVien.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, " Mã Nhân viên không để trống ", "Thông báo!", JOptionPane.ERROR_MESSAGE);

            return false;
        } else if (txt_MaNhanVien.getText().length() > 30) {
            JOptionPane.showMessageDialog(null, " Mã Nhân viên chỉ nhập dưới 50 ký tự ", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtTenNhanVien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, " Họ tên không để trống", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (txtTenNhanVien.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "Họ tên chỉ nhập dưới 50 ký tự", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;

        }
        if (txtNgaySinh.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ngày sinh không được để trống", "Thông báo!", JOptionPane.ERROR_MESSAGE);

            return false;
        } else {
            SimpleDateFormat dinhdang = new SimpleDateFormat("yyyy-MM-dd");
            dinhdang.setLenient(false);
            try {
                dinhdang.parse(txtNgaySinh.getText());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Sai định dạng ngày sinh 'yyyy-MM-dd' ", "Thông báo!", JOptionPane.ERROR_MESSAGE);

                System.out.println(e);
                return false;

            }

        }

        if (txtSoDienThoai.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Xin mời nhập số điện thoại", "Thông báo!", JOptionPane.ERROR_MESSAGE);

            return false;
        } else if (!txtSoDienThoai.getText().matches("0[0-9]{9,10}")) {
            JOptionPane.showMessageDialog(null, "Sai định dạng số điện thoại", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Xin mời nhập Email", "Thông báo!", JOptionPane.ERROR_MESSAGE);

            return false;
        } else if (!txtEmail.getText().matches("\\w+@\\w+(\\.\\w+){1,2}")) {
            JOptionPane.showMessageDialog(null, "Sai định dang Email", "Thông báo!", JOptionPane.ERROR_MESSAGE);

            return false;

        }

        if (txtDiaChi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Xin mời nhập địa chỉ", "Thông báo!", JOptionPane.ERROR_MESSAGE);
        }
        if (txtLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Xin mời nhập số Lương", "Thông báo!", JOptionPane.ERROR_MESSAGE);

            return false;
        } else if (!txtLuong.getText().matches("0[0-9]{9,10}")) {
            JOptionPane.showMessageDialog(null, "Sai định dạng lương", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;

    }

    public boolean checktrung() {
        Nhanvien nv = NhanVienDao.timkiemNhanVien(txt_MaNhanVien.getText());
        if (nv != null) {
            JOptionPane.showMessageDialog(null, "Trùng mã nhân viên", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;

    }

    public void loadtable() {
        model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        list = NhanVienDao.danhsachNhanVien("");
        for (Nhanvien nv : list) {
            String gt;
            if (nv.getGioitinh() == true) {
                gt = "Nam";
            } else {
                gt = "Nu";
            }
            Object[] a = new Object[]{
                nv.getMaNhanVien(), nv.getTenNhanVien(), gt, nv.getNgaySinh(), nv.getSoDienThoai(), nv.getDiaChi(), nv.getChucVu(), nv.getLuong(), nv.getEmail()
            };

            model.addRow(a);

        }

    }

    public void them() {
        if (checkdulieu() && checktrung()) {
            try {
                boolean gt;
                String t;
                if (rboNam.isSelected()) {
                    gt = true;
                    t = "Nam";
                } else {
                    gt = false;
                    t = "Nữ";
                }
                Date ngaysinh = new SimpleDateFormat("yyyy-dd-MM").parse(txtNgaySinh.getText());
                Nhanvien nv = new Nhanvien(txt_MaNhanVien.getText(), txtTenNhanVien.getText(), gt, ngaysinh, txtSoDienThoai.getText(), txtDiaChi.getText(), cbbChucVu.getSelectedItem().toString(), txtLuong.getText(), txtEmail.getText());
                boolean themnv = NhanVienDao.themnhanvien(nv);
                if (themnv = false) {
                    JOptionPane.showMessageDialog(null, "Lỗi thêm nhân viên vào CSDL", "Thông báo!", JOptionPane.ERROR_MESSAGE);

                } else {
                    Vector thembang = new Vector();
                    thembang.add(nv.getMaNhanVien());
                    thembang.add(nv.getTenNhanVien());
                    thembang.add(nv.getGioitinh());
                    thembang.add(new SimpleDateFormat("yyyy-dd-MM").format(nv.getNgaySinh()));
                    thembang.add(nv.getSoDienThoai());

                    thembang.add(nv.getDiaChi());
                    thembang.add(nv.getChucVu());
                    thembang.add(nv.getLuong());
                    thembang.add(nv.getEmail());
                    model.addRow(thembang);
                    JOptionPane.showMessageDialog(null, "Thêm thành công nhân viên : " + txtTenNhanVien.getText(), "Thông báo!", JOptionPane.INFORMATION_MESSAGE);

//                    if (nv.getChucVu().equals("admin") || nv.getChucVu().equals("nhân viên")) {
//                        if (checktaikhoan()) {
//                            FrmDangNhap dn = new FrmDangNhap(nv.getMaNhanVien(), "123456", nv.getChucnang());
//                            if (DangNhapDao.(dn)) {
//                                JOptionPane.showMessageDialog(rootPane, "Tài khoản của nhân viên : " + nv.getHoten() + "\n Tên đăng nhập : "
//                                        + dn.getTentaikhoan() + "\n Mật Khẩu : " + dn.getMatkhau() + "\n Chức năng : " + dn.getChucnang());
//                            } else {
//                                 JOptionPane.showMessageDialog(null, "Lỗi thêm tài khoản"  , "Thông báo!", JOptionPane.ERROR_MESSAGE);
//                              
//                            }
//
//                        }
//                    }
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Lỗi thêm nhân viên " + ex, "Thông báo!", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void capnhat() {
        if (checkdulieu() && checktontai()) {
            index = tblNhanVien.getSelectedRow();
            if (index < 0) {
                JOptionPane.showMessageDialog(null, "Xin mời chọn vị trí cập nhật", "Thông báo!", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                try {
                    boolean gt;
                    String t;
                    if (rboNam.isSelected()) {
                        gt = true;
                        t = "Nam";
                    } else {
                        gt = false;
                        t = "Nữ";
                    }
                    Date ngaysinh = new SimpleDateFormat("yyyy-dd-MM").parse(txtNgaySinh.getText());
                    Nhanvien nv = new Nhanvien(txt_MaNhanVien.getText(), txtTenNhanVien.getText(), gt, ngaysinh, txtSoDienThoai.getText(), txtDiaChi.getText(), cbbChucVu.getSelectedItem().toString(), txtLuong.getText(), txtEmail.getText());
                    boolean capnhat = NhanVienDao.capnhatNhanVien(nv);
                    if (capnhat) {
                        model.setValueAt(txt_MaNhanVien.getText(), index, 0);
                        model.setValueAt(txtTenNhanVien.getText(), index, 1);
                        model.setValueAt(t, index, 2);
                        model.setValueAt(txtNgaySinh.getText(), index, 3);
                        model.setValueAt(txtSoDienThoai.getText(), index, 4);
                        model.setValueAt(txtDiaChi.getText(), index, 5);
                        model.setValueAt(cbbChucVu.getSelectedItem().toString(), index, 6);
                        model.setValueAt(txtLuong.getText(), index, 7);
                        model.setValueAt(txtEmail.getText(), index, 8);
                        JOptionPane.showMessageDialog(null, "Cập nhật thành công Mã nhân viên :" + txt_MaNhanVien.getText(), "Thông báo!", JOptionPane.INFORMATION_MESSAGE);

//                        if (nv.getChucVu().equals("Quản lý") || nv.getChucVu().equals("Thu ngân")) {
//                            if (checktaikhoan()) {
//                                 dn = new Dangnhap(nv.getManhanvien(), "123456", nv.getChucnang());
//                                if (DangNhapDao.themTaikhoan(dn)) {
//                                    JOptionPane.showMessageDialog(rootPane, "Tài khoản của nhân viên : " + nv.getHoten() + "\n Tên đăng nhập : "
//                                            + dn.getTentaikhoan() + "\n Mật Khẩu : " + dn.getMatkhau() + "\n Chức năng : " + dn.getChucnang());
//                                } else {
//                                 JOptionPane.showMessageDialog(null, "Lỗi thêm tài khoản CSDL Cập nhật"  , "Thông báo!", JOptionPane.ERROR_MESSAGE);
//                                }
//
//                            }
//                        } else {
//                            if (DangNhapDao.xoaTaikhoan(nv.getMaNhanVien())) {
//                                JOptionPane.showMessageDialog(rootPane, "Xóa Tài khoản " + nv.getMaNhanVien());
//                            }
//
//                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Lỗi cập nhật " + e, "Thông báo!", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }

    public void xoa() {
        index = tblNhanVien.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Xin mời chọn vị trí xóa", "Thông báo!", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean nv = NhanVienDao.xoaNhanvien(txt_MaNhanVien.getText());
            if (nv) {
                model.removeRow(index);
                JOptionPane.showMessageDialog(null, "Xóa thành công Nhân viên", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "lỗi xóa nhân viên", "Thông báo!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void lammoi() {
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtTenNhanVien.setText("");
        txt_MaNhanVien.setText("");
        txtTimKiem.setText("");
        txtNgaySinh.setText("");
        txtLuong.setText("");
        txtSoDienThoai.setText("");

    }

    public void showdetail(int index) {
        Nhanvien nv = NhanVienDao.timkiemNhanVien(tblNhanVien.getValueAt(index, 0).toString());
        txt_MaNhanVien.setText(tblNhanVien.getValueAt(index, 0).toString());
        txtTenNhanVien.setText(tblNhanVien.getValueAt(index, 1).toString());
        String gt = tblNhanVien.getValueAt(index, 2).toString();
        if (gt.equals("Nam")) {
            rboNam.setSelected(true);
        } else {
            rboNu.setSelected(true);
        }
        txtNgaySinh.setText(tblNhanVien.getValueAt(index, 3).toString());
        txtSoDienThoai.setText(tblNhanVien.getValueAt(index, 4).toString());
        txtDiaChi.setText(tblNhanVien.getValueAt(index, 5).toString());
        cbbChucVu.setSelectedItem(tblNhanVien.getValueAt(index, 6).toString());
        txtLuong.setText(tblNhanVien.getValueAt(index, 7).toString());
        txtEmail.setText(tblNhanVien.getValueAt(index, 8).toString());
    }

    public boolean checktontai() {
        String timkiem = txt_MaNhanVien.getText();

        Nhanvien nv = NhanVienDao.timkiemNhanVien(timkiem);
        if (nv == null) {
            JOptionPane.showMessageDialog(null, "Nhân viên có mã " + txt_MaNhanVien.getText() + " không tồn tại", "Thông báo!", JOptionPane.ERROR_MESSAGE);

            return false;
        }
        return true;
    }

    public void timkiemnhanvien() {
        model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        for (Nhanvien nv : NhanVienDao.search(txtTimKiem.getText())) {
            String gt;
            if (nv.getGioitinh()) {
                gt = "Nam";
            } else {
                gt = "Nữ";
            }
            Object a[] = new Object[]{
                nv.getMaNhanVien(), nv.getTenNhanVien(), gt, nv.getNgaySinh(), nv.getSoDienThoai(), nv.getDiaChi(), nv.getChucVu(), nv.getLuong(), nv.getEmail()
            };
            model.addRow(a);

        }
    }
//           public boolean checktaikhoan() {
//        Dangnhap dn = dangnhapDAO.timkiemTaiKhoan(txt_manhanvien2.getText());
//        if (dn != null) {
//               JOptionPane.showMessageDialog(null, "Nhân viên "+txt_hovaten.getText()+" đã có tài khoản"  , "Thông báo!", JOptionPane.ERROR_MESSAGE);
//         
//            return false;
//        }
//
//        return true;
//    }
}