package com.lequangdaidi2008110065;
import java.util.Scanner;
public class BangCuuChuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Bảng Cửu Chương Từ 2 đến 9 ");
    for (int i = 2 ; i < 10 ; i++)
        for ( int j = 1  ; j < 11 ; j++)
            System.out.printf(" \t %d x %d = %d" , i,j,i*j);
    
}
}
