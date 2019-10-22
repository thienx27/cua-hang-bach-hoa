package Entity;
// Generated Oct 22, 2019 2:33:55 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Hanghoa generated by hbm2java
 */
public class Hanghoa  implements java.io.Serializable {


     private Serializable maHangHoa;
     private Serializable tenHangHoa;
     private Serializable loaihanghoa;
     private Serializable nhaCungCap;
     private Serializable maThuongHieu;
     private Integer giaban;
     private Integer soLuong;
     private Set chiTietHoaDons = new HashSet(0);

    public Hanghoa() {
    }

	
    public Hanghoa(Serializable maHangHoa, Serializable nhaCungCap) {
        this.maHangHoa = maHangHoa;
        this.nhaCungCap = nhaCungCap;
    }
    public Hanghoa(Serializable maHangHoa, Serializable tenHangHoa, Serializable loaihanghoa, Serializable nhaCungCap, Serializable maThuongHieu, Integer giaban, Integer soLuong, Set chiTietHoaDons) {
       this.maHangHoa = maHangHoa;
       this.tenHangHoa = tenHangHoa;
       this.loaihanghoa = loaihanghoa;
       this.nhaCungCap = nhaCungCap;
       this.maThuongHieu = maThuongHieu;
       this.giaban = giaban;
       this.soLuong = soLuong;
       this.chiTietHoaDons = chiTietHoaDons;
    }
   
    public Serializable getMaHangHoa() {
        return this.maHangHoa;
    }
    
    public void setMaHangHoa(Serializable maHangHoa) {
        this.maHangHoa = maHangHoa;
    }
    public Serializable getTenHangHoa() {
        return this.tenHangHoa;
    }
    
    public void setTenHangHoa(Serializable tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }
    public Serializable getLoaihanghoa() {
        return this.loaihanghoa;
    }
    
    public void setLoaihanghoa(Serializable loaihanghoa) {
        this.loaihanghoa = loaihanghoa;
    }
    public Serializable getNhaCungCap() {
        return this.nhaCungCap;
    }
    
    public void setNhaCungCap(Serializable nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
    public Serializable getMaThuongHieu() {
        return this.maThuongHieu;
    }
    
    public void setMaThuongHieu(Serializable maThuongHieu) {
        this.maThuongHieu = maThuongHieu;
    }
    public Integer getGiaban() {
        return this.giaban;
    }
    
    public void setGiaban(Integer giaban) {
        this.giaban = giaban;
    }
    public Integer getSoLuong() {
        return this.soLuong;
    }
    
    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
    public Set getChiTietHoaDons() {
        return this.chiTietHoaDons;
    }
    
    public void setChiTietHoaDons(Set chiTietHoaDons) {
        this.chiTietHoaDons = chiTietHoaDons;
    }




}


