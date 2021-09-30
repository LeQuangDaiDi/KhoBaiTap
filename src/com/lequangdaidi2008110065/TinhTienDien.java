package com.lequangdaidi2008110065;
import java.util.Scanner;
public class TinhTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số điện sử dụng : ");
        double sodien = scanner.nextDouble();
        if ( sodien <= 50 ){
            int giadien = 1000 ; 
            double tiendien = sodien*giadien ;
            System.out.println("Tổng tiền điện của tháng  : "+tiendien);
    }   else if (sodien > 50){
            int giadien = 1200 ;
            double tiendien = 50*1000+(sodien-50)*1200;
            System.out.println("Tổng tiền điện của tháng  : "+tiendien);
    }

    
}
}
