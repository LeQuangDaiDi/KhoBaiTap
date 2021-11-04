package kiemtragiuaky;
public class HocVien extends Nguoi{
    private Double diemMonhoc1 ;
    private Double diemMonhoc2 ;
    private static int soLuongHV ;
    protected Double DiemTB() {
        if (diemMonhoc1 >= 0 && diemMonhoc1 <= 10 &&diemMonhoc2 >= 0 && diemMonhoc2 <= 10 )
        return ( getDiemMonhoc1() + getDiemMonhoc2() ) /2 ;
        return diemMonhoc1;
    }
    public static int getSoLuongHV() {
        return soLuongHV;
    }
    public static void setSoLuongHV(int soLuongHV) {
        HocVien.soLuongHV = soLuongHV;
    }

    public Double getDiemMonhoc1() {
        return diemMonhoc1;
       
    }
    public void setDiemMonhoc1(Double diemMonhoc1) {
        this.diemMonhoc1 = diemMonhoc1;
    }
    public Double getDiemMonhoc2() {
        return diemMonhoc2;
    }
    public void setDiemMonhoc2(Double diemMonhoc2) {
        this.diemMonhoc2 = diemMonhoc2;
    }
    
    HocVien (String hoTen , String diaChi , Double diemMonhoc1 , Double diemMonhoc2){
        super(hoTen, diaChi);
        this.diemMonhoc1 = getDiemMonhoc1() ;
        this.diemMonhoc2 = getDiemMonhoc2() ;
    }

    public String toString() {
        String s ;
        s = getHoTen() + getDiaChi() + DiemTB();
        return s ;
    }
    
   





    
}
