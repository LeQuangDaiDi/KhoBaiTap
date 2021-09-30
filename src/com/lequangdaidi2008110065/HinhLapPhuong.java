package com.lequangdaidi2008110065;
import java.util.Scanner;
public class HinhLapPhuong {
    public static void main(String[] args) {
        Scanner Canh = new Scanner(System.in);
        System.out.print("Nhập chiều dài cạnh hình lập phương : ");
        int chieudaicanh = Canh.nextInt();
        int thetichhinhlapphuong = chieudaicanh*chieudaicanh*chieudaicanh;
        System.out.println("Thể tích hình lập phương : "+thetichhinhlapphuong);
    }
    
}
