package kiemtragiuaky;

public class KhachHang extends Nguoi {
    private String tenCongTy;
    private double triGiaHoaDon;
    public String getTenCongTy() {
        return tenCongTy;
    }
    public double getTriGiaHoaDon() {
        return triGiaHoaDon;
    }
    public void setTriGiaHoaDon(double triGiaHoaDon) {
        if (getTriGiaHoaDon() >= 0 )
        this.triGiaHoaDon = triGiaHoaDon;
    }



     KhachHang(String hoTen, String diaChi, String tenCongTy, double triGiaHoaDon) {
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }
    @Override
    public String toString() {
        return super.toString() + " Tên Công Ty : " + getTenCongTy() + "  Trị Giá Hóa Đơn : " + getTriGiaHoaDon() ;
    }

}
