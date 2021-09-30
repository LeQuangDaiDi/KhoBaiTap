package com.lequangdaidi2008110065;
import java.util.Scanner;
public class TinhPhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a : ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b : ");
        double b = scanner.nextDouble();
        double nghiem=-b/a;
        if ( a==0){
            if ( b==0)
                System.out.println("Phương trình vô số nghiệm ");
            else 
                System.out.println("Phương trình vô nghiệm ");
        }else 
            System.out.println("Phương trình có nghiệm là : "+nghiem);

    }    
}
