package com.dilqd2008110065.BaiTapVeNha;
import java.util.Scanner;

public class Customer {
    String[] TenKhachHang = new String[100] ;
    String[] DiaChiKhachHang = new String[100] ;
    int soLuongKhachHang;
    Customer(int n){
        soLuongKhachHang = n;
    }
    void getName(){
        for(int i = 0 ; i < soLuongKhachHang ; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print(" Nhập tên khách hàng thứ  "+ (i+1) + ":");
            TenKhachHang[i] = sc.nextLine();
        }
    }
    void getAddress(){
        for(int i = 0 ; i <soLuongKhachHang ; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập địa chỉ khách hàng thứ "+ (i+1) + " : ");
            DiaChiKhachHang[i] = sc.nextLine();
        }
    }
    void Information(){
        for(int i = 0 ; i < soLuongKhachHang ; i++){
            System.out.println("STT" + (i+1) + "Tên khách hàng : " + TenKhachHang[i]);
            System.out.println("Địa Chỉ : " + DiaChiKhachHang[i]);
        }
    }
}