package com.lequangdaidi2008110065;
import java.util.Scanner;
public class MangSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng : ");
        int sophantu = scanner.nextInt();
        int i ;
        int j ;
        int[] mang ;
        mang = new int [100] ;
        for (i = 0 ; i < sophantu ; i++){
            System.out.printf("Số phần tử thứ %d :  ",i );
            mang[i] = scanner.nextInt();
            
        }
        System.out.print("Số phần tử trong mảng : ");
        for (i = 0 ; i < sophantu ; i++)
        System.out.print("\t"+mang[i]);
        for( i=0;i < sophantu - 1 ;i++)
            for( j=i+1;j<sophantu;j++)
            {
                if(mang[i]>mang[j]) //neu giam thi doi thanh dau >
                {
                int temp=mang[i];
                mang[i]=mang[j];
                mang[j]=temp;
                }
            }
        System.out.print("\nMảng Được Sắp Xếp Lại : ");  
        for (i = 0 ; i < sophantu ; i++)
        System.out.print("\t"+mang[i]);  
        System.out.print("\nSố Nhỏ Nhất Trong Mảng : "+mang[0]);  

           
    
    }
}
