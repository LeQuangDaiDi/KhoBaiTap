package com.lequangdaidi2008110065;
import java.util.Scanner;
public class MangHoTenVaDiem {
    public static void NhapHoTenVaDiem(int soluonghocsinh , String hoten[] , float diemso[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i <= soluonghocsinh ; i++){
            System.out.print("Nhập họ và tên học sinh  : ");
            hoten[i] = sc.nextLine();
            System.out.print("Nhập điểm  : ");
            diemso[i] = sc.nextFloat();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh : ");
        int soluonghocsinh  = sc.nextInt();
        String[] NhapHoTenVaDiem = new String[soluonghocsinh];
        float[] NhapHoTenVaDiem = new float[soluonghocsinh];
        NhapHoTenVaDiem(soluonghocsinh,hoten,diemso);
    }