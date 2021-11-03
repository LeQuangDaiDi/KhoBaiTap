package lab7;

public class SinhVienKT extends SinhVienGD {
    private Double diemMarketing ;
    private Double diemSales ; 
   
    SinhVienKT(String hoTen , String nganh ,Double diem , Double diemMarketing , Double diemSales ){
        super(hoTen, nganh, diem);
     this.diemMarketing = diemMarketing;
     this.diemSales = diemSales;
      
    }
 

	public Double getDiem() {
        return super.getDiem();
    }
    protected void xuatdiemnganh(){

        System.out.println("Điểm Marketing : "+diemMarketing);
        System.out.println("Điểm Sales     : "+diemSales);
    
    }
    
    
}
