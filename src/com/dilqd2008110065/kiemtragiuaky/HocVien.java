package com.dilqd2008110065.kiemtragiuaky;

public class HocVien extends Nguoi {
    private Float diemMonhoc1;
    private Float diemMonhoc2;
    private static int soLuongHV;
    public Float getDiemMonhoc1() {
        
        
        return diemMonhoc1;
    }
    public Float getDiemMonhoc2() {
        return diemMonhoc2;
    }
    public void setDiemMonhoc1(Float diemMonhoc1) {
        if (getDiemMonhoc1() >= 0 && getDiemMonhoc1() <= 10 )
        this.diemMonhoc1 = diemMonhoc1;
    }
    public void setDiemMonhoc2(Float diemMonhoc2) {
        if (getDiemMonhoc2() >= 0 && getDiemMonhoc2() <= 10 )
        this.diemMonhoc2 = diemMonhoc2;
    }
   
    

    public HocVien(String hoTen, String diaChi, Float diemMonhoc1, Float diemMonhoc2,int soLuongHV) {
        super(hoTen, diaChi);
        this.diemMonhoc1 = diemMonhoc1;
        this.diemMonhoc2 = diemMonhoc2;
        this.soLuongHV = soLuongHV;   
    }
    protected float diemTB() {
        
        return (getDiemMonhoc1() + getDiemMonhoc2())/2;
    }
    @Override
    public String toString() {
        return super.toString() + " Điểm môn học 1 :" +getDiemMonhoc1() + " Điểm môn học 2 : " +getDiemMonhoc2() + "Điểm Trung Bình Môn " + diemTB();
    }
}