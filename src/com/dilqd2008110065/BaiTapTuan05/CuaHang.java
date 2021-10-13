public class CuaHang {
    public static void main(String[] args) {
        Sach sach ;

        sach = new Sach (5000,"KOS",2021,7500,20,"A");
        
        System.out.print
        ("Giá nhập : "+sach.giaban + 
        "\nNhà xuất bản : "+sach.nhaxuatban + 
        "\nNăm sản xuất : "+sach.namsuatban+
        "\nGiá bán : "+sach.giaban+
        "\nSố lương : "+sach.soluong+
        "\nXếp loại : "+sach.loai);

        NhanVien nhanvien ;
        nhanvien = new NhanVien
        ("Lê Quang Đại Dĩ",5,"125/14A Vạn Kiếp P3 QBT Tp HCM Vietnamese","Chuyên viên kĩ thuật cấp cao","19/06/2002");
        System.out.print
        ("\n Họ tên nhân viên : "+nhanvien.tennhanvien+
        "\n Lương tháng (triệu $) :"+nhanvien.luong+
        "\n Địa Chỉ : "+nhanvien.diachi+
        "\n Bộ phận làm việc : "+nhanvien.bophanlamviec+
        "\n Ngày Sinh : "+nhanvien.ngaysinh);
       Xe xe ;
       xe = new Xe
       ("Lê Quang Đại Dĩ", "Lamborghini", "Lamborghini Aventador LP 700-4", "B1 B2 C E FC", 90);
       System.out.print
       ("\n Họ tên chủ xe : "+xe.tenchuxe+
       "\n Hãng xe :"+xe.hangsanxuat+
       "\n Dòng xe : "+xe.dong+
       "\n Các loại giấy phép lái xe : "+xe.giayphep+
       "\n Dung tích xăng : "+xe.dungtichxang);
        MayTinh maytinh ;
        maytinh = new MayTinh
        ("Gigabyte",2021,"Win 10 Pro" , "64G" , "Intel core i9-9900X" ,9541.213,"3 năm");
        System.out.print
       (
        "\n Nhà sản xuất : "+maytinh.nhasanxuat+
       "\n Năm Sản Xuất : "+maytinh.namsanxuat+
       "\n Hệ điều hành : "+maytinh.hedieuhanh+
       "\n Ram : "+maytinh.ram+
       "\n CPU : "+maytinh.cpu+
       "\n Giá : "+maytinh.gia+
       "\n Năm bảo hành : "+maytinh.nambaohanh);
       TaiKhoan taikhoan ;
       taikhoan = new TaiKhoan
       ("Lê Quang Đại Dĩ",1016960878,861234.456);
       System.out.print
       (
        "\n Tên chủ tài khoản : "+taikhoan.tenchutaikhoan+
        "\n Số tài khoản : " +taikhoan.sotaikhoan+
        "\n Số Dư :  "+taikhoan.sodu
       );
        
    }
}
