package com.dilqd2008110065.BaiTapVeNha;
import java.util.Scanner;

public class Emloyee {
    String[] Name = new String[100];
    float[] Salary = new float[100];
    int soLuongNhanVien ;
    Emloyee(int n){
        soLuongNhanVien = n;
    }
    void getName(){
        for(int i = 0 ; i < soLuongNhanVien ; i++){
            System.out.print("Nhập tên của nhân viên thứ " + (i+1) +" : ");
            Scanner sc = new Scanner(System.in);
            Name[i] = sc.nextLine(); 
        }
    }
    void getSalary(){
        for(int i = 0 ; i < soLuongNhanVien ; i++){
            System.out.print("Nhập lương của nhân viên thứ  " + (i+1) + " : ");
            Scanner sc = new Scanner(System.in);
            Salary[i] = sc.nextFloat();
        }
    }
    void printInfomationEmployee(){
        for(int i = 0 ; i < soLuongNhanVien ; i++){
            System.out.println("Tên nhân viên là : " + Name[i]);
            System.out.println("Lương nhân viên là : " + Salary[i]);
        }
    }
}