package kiemtragiuaky;


    public class NhanVien extends Nguoi {
        private float heSoLuong;
        public Float getHeSoLuong() {
            return heSoLuong;
        }
        
        public void setHeSoLuong(float heSoLuong) {
            if (getHeSoLuong() >= 0 )
            this.heSoLuong = heSoLuong;
        }
        
        
        public NhanVien(String hoTen, String diaChi, float heSoLuong) {
            super(hoTen, diaChi);
            this.heSoLuong = heSoLuong;
        }
        public float tinhLuong() {
            return heSoLuong*1500000;
        }
        @Override
        public String toString() {
            return super.toString() + " Tiền Lương Trong Tháng : " + tinhLuong() +" VND" ;
        }
    }
    

