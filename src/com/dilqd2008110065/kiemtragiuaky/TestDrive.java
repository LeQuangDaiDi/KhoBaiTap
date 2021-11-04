package com.dilqd2008110065.kiemtragiuaky;

public class TestDrive {
    public static void main(String[] args) {
        HocVien hv = new HocVien("Lê Quang Đại Dĩ", "Quận Bình Thạnh", (float)10, (float)10, 300);
        KhachHang kh = new KhachHang("Lê Quang Đại Dĩ", "Quận Bình Thạnh" , "ITT" , (double) 150);
        NhanVien nv = new NhanVien("Lê Quang Đại Dĩ", "Quận Bình Thạnh", (float) 4.8);
        System.out.println(hv);
        System.out.println("*****>>>>   <<<<*****");
        System.out.println(kh);
        System.out.println("*****>>>>   <<<<*****");
        System.out.println(nv);
        System.out.println("*****>>>>   <<<<*****");
        
        DanhSachQuanLy list = new DanhSachQuanLy();
        HocVien hv1 = new HocVien("Lê Ngọc", "Quận 3", (float) 8,  (float) 9, 230);
        list.themNguoi(hv1);
        KhachHang kh1 = new KhachHang("Lê Ba", "Quận Tân BÌnh" , "Cống Thoát Nước TP HCM" , (double) 420.5);
        list.themNguoi(kh1);
        NhanVien nv1 = new NhanVien("Trần Hưng", "Quận 7", (float) 2.3);
        list.themNguoi(nv1);
        list.inDanhSach();
    }

    }
    

