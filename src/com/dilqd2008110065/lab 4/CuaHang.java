import java.util.ArrayList;
import java.util.List;
public class CuaHang {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Lựu Đạn");
        list.add("C4");
        list.add("Bom Nguyên Tử");
        System.out.println(list);
        System.out.println("****>>>    <<<****");
        SanPham sanpham4 = new SanPham("Đá Quý" , 1000.0 , 200.0);
        System.out.println("Tên Sản Phẩm : "+sanpham4.getTenSanPham());
        System.out.println("Giá Sản Phẩm : "+sanpham4.getDonGia());
        System.out.println("Giảm Giá     : "+sanpham4.getGiamGia());
        System.out.println("****>>>    <<<****");
        SanPham sanpham3 = new SanPham("Kim Cương", 1500.0);
        System.out.println("Tên Sản Phẩm : "+sanpham3.getTenSanPham());
        System.out.println("Giá Sản Phẩm : "+sanpham3.getDonGia());
        System.out.println("****>>>    <<<****");
        SanPham sanpham = new SanPham();
        sanpham.nhap();
        sanpham.getThueNhapKhau();
        System.out.println("****>>>    <<<****");
        sanpham.xuat();
        System.out.println("****>>>    <<<****");
        SanPham sanpham1 = new SanPham();
        sanpham1.nhap();
        sanpham1.getThueNhapKhau();
        System.out.println("****>>>    <<<****");
        sanpham1.xuat();
        System.out.println("****>>>    <<<****");
        SanPham sanpham2 = new SanPham();
        sanpham2.nhap();
        sanpham2.getThueNhapKhau();
        System.out.println("****>>>    <<<****");
        sanpham2.xuat();
        System.out.println("****>>>    <<<****");
    
    




        
    }
    
}
