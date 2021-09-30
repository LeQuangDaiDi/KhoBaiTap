package com.lequangdaidi2008110065;
import java.util.Scanner;
public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số : ");
        int songuyento = scanner.nextInt();
        for (int i = 2 ; i <= songuyento-1 ; i++){
            if ( songuyento % i == 0 ){
                System.out.printf("Số %d không phải là số nguyên tố  ",songuyento);
            }
            else   
                System.out.printf("Số %d là số nguyên tố ",songuyento);

        }
        
    }
    
}
