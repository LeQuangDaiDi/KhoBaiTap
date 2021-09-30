package com.lequangdaidi2008110065;

import java.util.Scanner;

public class HoTenVaDiemTrungBinh {
     public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Họ và tên: "); 
        String hoTen = scanner.nextLine();
        System.out.println("Họ và tên "+hoTen);
        System.out.print("Điểm TB: "); 
        
        
        double diemTB = scanner.nextDouble(); 
        System.out.println("Điểm TB "+diemTB);

        
        
        
    }
}
