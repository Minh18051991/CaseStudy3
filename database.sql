CREATE DATABASE if not EXISTS case_study_3;
USE case_study_3;
-- Tạo bảng NguoiDung
CREATE TABLE khach_hang
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    ho_ten        VARCHAR(100) NOT NULL,
    dia_chi       VARCHAR(255),
    so_dien_thoai VARCHAR(15),
    email         varchar(100),
    xoa           boolean default false
);
-- Tạo bảng TaiKhoan
CREATE TABLE tai_khoan
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    khach_hang_id INT UNIQUE,
    ten_dang_nhap VARCHAR(50) UNIQUE NOT NULL,
    mat_khau      VARCHAR(255)       NOT NULL,
    ngay_tao      DATETIME DEFAULT CURRENT_TIMESTAMP, -- Thêm cột ngay_tao
    xoa           boolean  default false,
    foreign key (khach_hang_id) references khach_hang (id)
);
-- Tạo bảng DanhMuc
CREATE TABLE loai_san_pham
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    ten_san_pham VARCHAR(100) NOT NULL
);

-- tạo bảng kho
create table kho
(
    id          int primary key auto_increment,
    ten varchar(100),
    ngay_nhap   DATETIME DEFAULT CURRENT_TIMESTAMP,
    
    xoa         boolean  default false
    

);

-- Tạo bảng SanPham
CREATE TABLE san_pham
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    loai_san_pham_id INT,
    kho_id int,
    ten_san_pham     VARCHAR(100) NOT NULL,
    mo_ta            TEXT,
    gia              double       NOT NULL,
    anh              text,
    xoa              boolean default false,
    ngay_nhap datetime DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (loai_san_pham_id) REFERENCES loai_san_pham (id),
    FOREIGN KEY (kho_id) REFERENCES kho (id)
    
);

-- Tạo bảng DonHang
CREATE TABLE don_hang
(
    id            INT AUTO_INCREMENT primary key,
    tai_khoan_id  INT,
    ngay_dat_hang DATETIME DEFAULT CURRENT_TIMESTAMP,
    trang_thai    boolean  default false,
    xoa           boolean  default false,
    FOREIGN KEY (tai_khoan_id) REFERENCES tai_khoan (id)
);
-- Tạo bảng ChiTietDonHang
CREATE TABLE chi_tiet_don_hang
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    don_hang_id INT,
    san_pham_id INT,
    so_luong    INT NOT NULL,
    FOREIGN KEY (don_hang_id) REFERENCES don_hang (id),
    FOREIGN KEY (san_pham_id) REFERENCES san_pham (id)
);
-- thêm bảng tên chức năng
create table chuc_nang
(
    id        int primary key auto_increment,
    chuc_nang varchar(50)
);
-- thêm bảng phân quyền
create table phan_quyen
(
    id           int primary key auto_increment,
    chuc_nang_id int,
    tai_khoan_id int,
    foreign key (chuc_nang_id) references chuc_nang (id),
    foreign key (tai_khoan_id) references tai_khoan (id)
);

-- San Pham
INSERT INTO loai_san_pham (ten_san_pham)
VALUES ('Điện thoại'),
       ('Laptop'),
       ('Máy tính bảng');
       
-- Kho
INSERT INTO kho (ten)
VALUES ('kho_san_pham'),
       ('kho_vat_tu')
       ;
       
       
INSERT INTO san_pham (loai_san_pham_id,kho_id, ten_san_pham, mo_ta, gia, anh,ngay_nhap)
VALUES (1,1, 'Iphone 12 Pro Max', 'iPhone 12 Pro Max là thiết bị điện thoại với chip A14 Bionic', 12000000,
        'https://cdn.tgdd.vn/Products/Images/42/213031/iphone-12-xanh-la-1-1-750x500.jpg','2012/12/12'),
       (2,1, 'Macbook Pro 16', 'Macbook Pro 16 2020 là laptop cao cấp với chip M1', 28000000,
        'https://cdn.tgdd.vn/Products/Images/44/325306/apple-macbook-air-m2-2022-16gb-256gb-10gpu-2-750x500.jpg','2022/01/01'),
       (2,1, 'Macbook Pro 16 PRO', 'Macbook Pro 16 2020 là laptop cao cấp với chip M1 HANG 99%', 22000000,
        'https://cdn.tgdd.vn/Products/Images/44/325306/apple-macbook-air-m2-2022-16gb-256gb-10gpu-2-750x500.jpg','2022/01/01'),
       (3,1, 'IPAD 9', ' WiFi 64GB', 6400000,
        'https://cdn.tgdd.vn/Products/Images/522/247517/ipad-9-wifi-trang-1-750x500.jpg','2022/01/01'),
       (3,1, 'IPAD 11', 'WiFi 512GB', 9000000,
        'https://cdn.tgdd.vn/Products/Images/522/325534/ipad-pro-13-inch-m4-lte-sliver-1-750x500.jpg','2022/01/01'),
       (1,1, 'XIAOMI 11', '14C 6GB/128GB', 12400000,
        'https://cdnv2.tgdd.vn/mwg-static/tgdd/Products/Images/42/329008/redmi-14c-xanh-duong-1-638618466993077110-750x500.jpg','2022/01/01')
;

-- Chức Năng
INSERT INTO chuc_nang (chuc_nang)
VALUES ('Admin'),
       ('User')
;
-- Khách Hàng
INSERT INTO khach_hang (ho_ten, dia_chi, so_dien_thoai, email)
VALUES ('Đặng Hữu Hải Minh', '245 Thanh Sơn', '0774524480', 'minhdhh91@gmail.com'),
       ('Nguyen Van A', '123, Hai Ba Trung', '0987654321', 'nguyenvana@gmail.com'),
       ('Nguyen Van B', '456, Hai Ba Trung', '0912345678', 'nguyenvanb@gmail.com'),
       ('Nguyen Van C', '789, Hai Ba Trung', '0998765432', 'nguyenvanc@gmail.com'),
       ('Nguyen Van D', '123, Hai Ba Trung', '0932165478', 'nguyenvand@gmail.com');

-- Tài Khoản
INSERT INTO tai_khoan (khach_hang_id, ten_dang_nhap, mat_khau)
VALUES (1, 'admin123', '123456'),
       (2, 'usera', 'usera'),
       (3, 'userb', 'userb'),
       (4, 'userc', 'userc'),
       (5, 'userd', 'userd');

-- Phân Quyền
INSERT INTO phan_quyen (chuc_nang_id, tai_khoan_id)
VALUES (1, 1),
       (2, 1),
       (2, 2),
       (2, 3),
       (2, 4),
       (2, 5);

-- Đơn Hàng
INSERT INTO don_hang (tai_khoan_id)
VALUES (2),
       (3),
       (4),
       (5);

-- Chi Tiết Đơn Hàng
INSERT INTO chi_tiet_don_hang (don_hang_id, san_pham_id, so_luong)
VALUES (1, 1, 2),
       (1, 3, 1),
       (2, 2, 3),
       (2, 4, 2),
       (3, 5, 1),
       (4, 6, 5);