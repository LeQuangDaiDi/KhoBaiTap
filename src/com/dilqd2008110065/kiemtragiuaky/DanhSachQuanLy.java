package com.dilqd2008110065.kiemtragiuaky;


import java.util.ArrayList;

public class DanhSachQuanLy {
    private ArrayList <Object> list = new ArrayList<>();
    public void themNguoi(Object danhsach) {
        list.add(danhsach);
    }
    public void inDanhSach() {
        for (Object name: list) {
            System.out.println(name.toString());
            System.out.println("*****>>>>   <<<<*****");
        }
    }
}