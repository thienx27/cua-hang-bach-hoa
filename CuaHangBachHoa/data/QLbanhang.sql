Create database QuanLyBanHang
use QuanLyBanHang


IF OBJECT_ID ('NhacCungCap') IS NOT NULL
DROP TABLE NhacCungCap
GO 
Create table NhacCungCap(
	MaNhaCungCap nvarchar(50) not null,
	TenNhaCungCap nvarchar(50) null,
	Diachi nvarchar(50) null,
	Dienthoai nvarchar(50) null,
	Email nvarchar(50) null,
	constraint PK_NhacCungCap primary key(MaNhaCungCap)
)


IF OBJECT_ID ('ThuongHieu') IS NOT NULL
DROP TABLE ThuongHieu
GO 
Create table ThuongHieu
(
	MaThuongHieu nvarchar(50) not null,
	TenThuongHieu nvarchar(50) null,
	constraint PK_ThuongHieu primary key(MaThuongHieu)
)

IF OBJECT_ID ('Hanghoa') IS NOT NULL
DROP TABLE Hanghoa
GO 
Create table Hanghoa(
	MaHangHoa nvarchar(50) not null,
	MaNhaCungCap nvarchar(50) not null,
	TenHangHoa nvarchar(50) null,
	Giaban int null,
	HanSuDung datetime null,
	Ngaynhap datetime null,
	SoLuong int null,
	MaThuongHieu nvarchar(50) null,
	Xuatxu nvarchar(50) null,
	ghichu nvarchar(50) null

	constraint PK_Hanghoa primary key(MaHangHoa),
	constraint FK_NhacCungCap_Hanghoa foreign key(MaNhaCungCap) references NhacCungCap(MaNhaCungCap),
	constraint FK_ThuongHieu_Hanghoa foreign key(MaThuongHieu) references ThuongHieu(MaThuongHieu)
)


IF OBJECT_ID ('nhanvien') IS NOT NULL
DROP TABLE nhanvien
GO
Create table nhanvien(
	MaNhanVien nvarchar(50) not null,
	Hoten nvarchar(50) null,
	Matkhau nvarchar(50) null,
	Vaitro nvarchar(50) null,
	constraint PK_nhanvien primary key(MaNhanVien)
)


IF OBJECT_ID ('Hoadon') IS NOT NULL
DROP TABLE Hoadon
GO 
Create table Hoadon(
	MaHoaDon nvarchar(50) not null,
	MaNhanVien nvarchar(50) not null,
	TenKhachHang nvarchar(50) null,
	Ngaylap datetime null,
	constraint PK_Hoadon primary key(MaHoaDon),
	constraint FK_Hoadon_nhanvien  foreign key(MaNhanVien) references nhanvien(MaNhanVien)
)


IF OBJECT_ID ('ChiTietHoaDon') IS NOT NULL
DROP TABLE ChiTietHoaDon
Create table ChiTietHoaDon(
	MaHoaDon nvarchar(50) not null,
	MaHangHoa nvarchar(50)not null,
	TenHangHoa nvarchar(50) null,
	SL int null,
	DonGia int null,
	Thanhtien int null
	constraint FK_ChiTietHoaDon_Hanghoa foreign key(MaHangHoa) references Hanghoa(MaHangHoa),
	constraint FK_MaHangHoa_Hoadon foreign key(MaHoaDon) references Hoadon(MaHoaDon)
)

delete NhacCungCap

select *from NhacCungCap
select*from ThuongHieu
select*from Hanghoa
select *from Hoadon
select *from ChiTietHoaDon
select *from nhanvien
