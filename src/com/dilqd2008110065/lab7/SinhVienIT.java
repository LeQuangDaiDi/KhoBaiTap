package lab7;

public class SinhVienIT extends SinhVienGD{
    private Double diemJava ;
    private Double diemCss ; 
    private Double diemHtml ;
    SinhVienIT(String hoTen , String nganh ,Double diem , Double diemJava , Double diemCss , Double diemHtml){
        super(hoTen, nganh, diem);
      this.diemJava = diemJava ;
      this.diemCss = diemCss ;
      this.diemHtml = diemHtml ;
    }
 

	public Double getDiem() {
        return super.getDiem();
    }
    protected void xuatdiemnganh(){

        System.out.println("Điểm Java : "+diemJava);
        System.out.println("Điểm Css  : "+diemCss);
        System.out.println("Điểm Html : "+diemHtml);
    }
    
}
