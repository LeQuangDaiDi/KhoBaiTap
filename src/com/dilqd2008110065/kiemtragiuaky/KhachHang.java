package kiemtragiuaky;
public class KhachHang extends Nguoi{
    private String tenCongTy ;
    private Double triGiaHoaDon ;
    public String getTenCongTy() {
        return tenCongTy;
    }
    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }
    public Double getTriGiaHoaDon() {
        return triGiaHoaDon;
    }
    public void setTriGiaHoaDon(Double triGiaHoaDon) {
        this.triGiaHoaDon = triGiaHoaDon;
    }
    KhachHang(String hoTen , String diaChi , String tenCongTy , Double triGiaHoaDon){
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy ;
        this.triGiaHoaDon = triGiaHoaDon ;

    }
    @Override
    public String toString() {
        String s ;
        s = getHoTen() + getDiaChi() + getTenCongTy() + getTriGiaHoaDon() ;
        // TODO Auto-generated method stub
        return s ;
    }
    
}
