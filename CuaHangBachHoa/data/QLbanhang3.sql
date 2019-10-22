-- tai khoan
IF OBJECT_ID('USERS') IS NOT NULL
	DROP TABLE USERS
GO
CREATE TABLE USERS(
	tentaikhoan NVARCHAR(50) NOT NULL, -- manhanvien phải cùng với tên tài khoản
	matkhau NVARCHAR(50) NOT NULL,
	chucnang nvarchar(50)NOT NuLL, --chức năng phải cùng với chức năng bảng nhân viên
	--KHOA CHINH
	CONSTRAINT PK_USERS PRIMARY KEY (tentaikhoan)
)

IF OBJECT_ID ('Hanghoa') IS NOT NULL
DROP TABLE Hanghoa
GO 
Create table Hanghoa(
	MaHangHoa nvarchar(50) not null,
	TenHangHoa nvarchar(50) null,
	Loaihanghoa nvarchar(50) null,
	NhaCungCap nvarchar(50) not null,
	MaThuongHieu nvarchar(50) null,
	Giaban int null,
	SoLuong int null,
	constraint PK_Hanghoa primary key(MaHangHoa),
)

IF OBJECT_ID ('nhanvien') IS NOT NULL
DROP TABLE nhanvien
GO
Create table nhanvien(
	MaNhanVien nvarchar(50) not null,
	TenNhanVien nvarchar(50) null,
	Gioitinh bit null,
	NgaySinh date null,
	SoDienThoai int null,
	DiaChi nvarchar(50) null,
	ChucVu nvarchar(50) null,
	Luong int null,
	Email nvarchar(50) null,
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
GO
Create table ChiTietHoaDon(
	MaHoaDon nvarchar(50) not null,
	MaHangHoa nvarchar(50)not null,
	TenHangHoa nvarchar(50) null,
	SL int null,
	DonGia int null,
	Thanhtien int null,
	constraint PK_ChiTietHoaDon primary key(MaHoaDon),
	constraint FK_ChiTietHoaDon_Hanghoa foreign key(MaHangHoa) references Hanghoa(MaHangHoa),
	constraint FK_MaHangHoa_Hoadon foreign key(MaHoaDon) references Hoadon(MaHoaDon)
)
delete USERS
 insert into USERS values (N'admin',N'Admin',N'admin')
 insert into USERS values (N'admin2',N'Admin',N'admin')
  insert into USERS values (N'admin3',N'Admin',N'admin')
 insert into USERS values (N'NhanVien1',N'guest',N'guest')
 insert into USERS values (N'NhanVien2',N'guest',N'guest')
 insert into USERS values (N'NhanVien3',N'guest',N'guest')
select *from USERS
select *from Hanghoa
select *from Hoadon
select *from ChiTietHoaDon
select *from nhanvien
