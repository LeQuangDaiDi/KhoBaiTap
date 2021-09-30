package com.lequangdaidi2008110065;
import java.util.Scanner;
public class TinhPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a : ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b : ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c : ");
        double c = scanner.nextDouble();
        double nghiem=-c/b;
        double nghiemkep = -b/(2*a);
        double Delta = Math.pow(b,2)-4*a*c;
        double SqrtDelta = Math.sqrt(Delta);
        double x1 = (-b+SqrtDelta)/(2*a);
        double x2 = (-b-SqrtDelta)/(2*a);
        if ( a==0){
            if ( b==0){ 
             if ( c==0)
                System.out.println("Phương trình vô số nghiệm ");
            else 
                System.out.println("Phương trình vô nghiệm ");
            }else 
            System.out.println("Phương trình có nghiệm là : "+nghiem);
            }if ( a != 0 ){
            
            if ( Delta < 0)
                 System.out.println("Phương trình vô nghiệm ");
            if ( Delta == 0)
            System.out.println("Phương trình có nghiệm kép  "+nghiemkep);
        else 
            System.out.println("Phương trình có có 2 nghiệm phân biệt  ");
            System.out.println("x1 =   "+x1);
            System.out.println("x2 =   "+x2);

        }



        }
    
}
