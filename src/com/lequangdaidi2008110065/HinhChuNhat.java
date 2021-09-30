package com.lequangdaidi2008110065;
import java.util.Scanner;
public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Nhap chieu dai : ");
        int chieudai = scanner.nextInt();
        System.out.print("Nhap chieu rong : ");
        int chieurong = scanner.nextInt();
        int ChuVi = (chieudai+chieurong)*2;
        int DienTich = chieudai*chieurong;
        int CanhNhoNhat = Math.min(chieudai,chieurong);
        System.out.println("Chu Vi Hinh Chu Nhat : "+ChuVi);
        System.out.println("Dien Tich Hinh Chu Nhat : "+DienTich);
        System.out.println("Canh Nho Nhat Hinh Chu Nhat : "+CanhNhoNhat);
    
    }
    
}
