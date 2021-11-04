package kiemtragiuaky;


public class Nguoi {
    private String hoTen;
    private String diaChi;

    public String getHoTen() {
        return hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }

     Nguoi(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    @Override
    public String toString() {
        return "Họ Tên :" +getHoTen() + " Địa Chỉ : " + getDiaChi();
    }
}  