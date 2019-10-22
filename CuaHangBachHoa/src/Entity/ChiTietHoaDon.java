package Entity;
// Generated Oct 22, 2019 2:33:55 AM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * ChiTietHoaDon generated by hbm2java
 */
public class ChiTietHoaDon  implements java.io.Serializable {


     private Serializable maHoaDon;
     private Hanghoa hanghoa;
     private Hoadon hoadon;
     private Serializable tenHangHoa;
     private Integer sl;
     private Integer donGia;
     private Integer thanhtien;

    public ChiTietHoaDon() {
    }

	
    public ChiTietHoaDon(Hanghoa hanghoa, Hoadon hoadon) {
        this.hanghoa = hanghoa;
        this.hoadon = hoadon;
    }
    public ChiTietHoaDon(Hanghoa hanghoa, Hoadon hoadon, Serializable tenHangHoa, Integer sl, Integer donGia, Integer thanhtien) {
       this.hanghoa = hanghoa;
       this.hoadon = hoadon;
       this.tenHangHoa = tenHangHoa;
       this.sl = sl;
       this.donGia = donGia;
       this.thanhtien = thanhtien;
    }
   
    public Serializable getMaHoaDon() {
        return this.maHoaDon;
    }
    
    public void setMaHoaDon(Serializable maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    public Hanghoa getHanghoa() {
        return this.hanghoa;
    }
    
    public void setHanghoa(Hanghoa hanghoa) {
        this.hanghoa = hanghoa;
    }
    public Hoadon getHoadon() {
        return this.hoadon;
    }
    
    public void setHoadon(Hoadon hoadon) {
        this.hoadon = hoadon;
    }
    public Serializable getTenHangHoa() {
        return this.tenHangHoa;
    }
    
    public void setTenHangHoa(Serializable tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }
    public Integer getSl() {
        return this.sl;
    }
    
    public void setSl(Integer sl) {
        this.sl = sl;
    }
    public Integer getDonGia() {
        return this.donGia;
    }
    
    public void setDonGia(Integer donGia) {
        this.donGia = donGia;
    }
    public Integer getThanhtien() {
        return this.thanhtien;
    }
    
    public void setThanhtien(Integer thanhtien) {
        this.thanhtien = thanhtien;
    }




}


