import java.util.Scanner;

public class HinhTron {
    void AmThanh(){
        System.out.println("è ... è ... è ...");
        System.out.println("... ... ....");
        System.out.println("... ... ....");

    }
    void TocDo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tốc độ xoay : ");
        double tocdo = sc.nextDouble();

    }
    void Xoay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số tọa độ ");
        System.out.print("x = ");
        double x = sc.nextDouble();
        System.out.print("y = ");
        double y = sc.nextDouble();
        System.out.print("z = ");
        double z = sc.nextDouble();
        System.out.print("Nhập hệ tọa độ bạn muốn xoay ( x y z ):  ");
        String goctoado = sc.next();
        System.out.print("Nhập hệ số xoay  :  ");
        Double hesotoado= sc.nextDouble();
        TocDo();
        AmThanh();
        System.out.print("Xoay Thành Công");
    }
    
}
