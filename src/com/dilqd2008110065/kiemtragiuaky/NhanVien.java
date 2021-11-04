package kiemtragiuaky;
public class NhanVien  extends Nguoi{
    private Float hesoLuong ;
    public Float getHesoLuong() {
        return hesoLuong;
    }
    public void setHesoLuong(Float hesoLuong) {
        this.hesoLuong = hesoLuong;
    }
    protected Float tinhLuong(){
        return getHesoLuong() * 1500000 ;
    }
    @Override
    public String toString() {
        String s ;
        s = getHoTen() + getDiaChi() + tinhLuong();
        // TODO Auto-generated method stub
        return s ;
    }
    NhanVien (String hoTen , String diaChi , Float hesoLuong){
        super(hoTen, diaChi);
        this.hesoLuong = hesoLuong ;
    }
}
