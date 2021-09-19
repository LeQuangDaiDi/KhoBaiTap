package tuan02;

import java.util.Scanner;

public class CTMinhHoaNhapXuat {
     public static void main(String[] args) {
        

        System.out.print("Lê Văn Tửng " + " Hello " + "Xin Chào");
        System.out.println(5+8);
        String tenSinhVien;
        float diemKTLapTrinh;
        Scanner bienNhapLieu;
        System.out.print("Nhap Diem KTLT : ");
        bienNhapLieu = new Scanner(System.in);
        diemKTLapTrinh = bienNhapLieu.nextFloat();
        System.out.print("Diem KTLT : "+diemKTLapTrinh);
       
        
    }
}
