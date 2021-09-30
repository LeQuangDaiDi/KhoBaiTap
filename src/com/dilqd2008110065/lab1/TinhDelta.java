package com.lequangdaidi2008110065;

import java.util.Scanner;
public class TinhDelta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập  hệ số a :  ");
        int a = scanner.nextInt();
        System.out.print("Nhập  hệ số b :  ");
        int b = scanner.nextInt();
        System.out.print("Nhập  hệ số c :  ");
        int c = scanner.nextInt();
        double Delta = Math.pow(b,2)-4*a*c;
        double SqrtDelta = Math.sqrt(Delta);
        System.out.println("Delta : "+Delta);
        System.out.println("SqrtDelta : "+SqrtDelta);

    }
    
}
