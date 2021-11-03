package lab7;
public class Drive {
    public static void main(String[] args) {
        
        ChuNhat cn = new ChuNhat();
        cn.setDai((double) 5);
        cn.setRong((double)7);
        Vuong v = new Vuong();
        v.setCanh((double) 6);
        cn.xuat();
        System.out.println("*****>>>>   <<<<*****   ");
        v.xuat();
        
        System.out.println("*****>>>>   <<<<*****   ");
        SinhVien sinhvien = new SinhVien();
        sinhvien.setHoTen("Lý Ngọc Bi");
        sinhvien.setNganh("Kế Toán");
        sinhvien.setDiem((double)10);
        sinhvien.xuat();
        
        SinhVienIT it = new SinhVienIT("Lê Quang Đại Dĩ", "IT" , (double) 10 ,  (double) 10 ,(double) 9, (double) 9);
        it.xuat();
        it.xuatdiemnganh();
        System.out.println("*****>>>>   <<<<*****");
        SinhVienKT kt = new SinhVienKT("Lý Ngọc Bi", "KT" , (double) 8, (double) 8, (double) 9);
        kt.xuat();
        kt.xuatdiemnganh();
        
        }
    }
    

