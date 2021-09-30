package com.lequangdaidi2008110065;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = 10 ;
        do{
        System.out.println(" ------>>> Menu <<<------ ");
        System.out.println(" >> 1 << Phương trình bậc 1 ");
        System.out.println(" >> 2 << Phương trình bậc 2 ");
        System.out.println(" >> 3 << Tính tiền điện ");
        System.out.println(" >> 4 << Thoát ");
        System.out.print(" Nhập lựa chọn bạn muốn :  ");
        int LuaChon = scanner.nextInt();
        switch(LuaChon){
            case 0 : 
            break ;
            case 1 :{
            System.out.print("Nhập hệ số a : ");
            double a = scanner.nextDouble();
            System.out.print("Nhập hệ số b : ");
            double b = scanner.nextDouble();
            double nghiem=-b/a;
            if ( a==0){
                if ( b==0)
                    System.out.println("Phương trình vô số nghiệm ");
                else 
                    System.out.println("Phương trình vô nghiệm ");
            }else 
                System.out.println("Phương trình có nghiệm là : "+nghiem);
    
            break ;
        }
            case 2 : {
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
            break ;
        }
            case 3 : {
            System.out.print("Nhập vào số điện sử dụng : ");
        double sodien = scanner.nextDouble();
        if ( sodien <= 50 ){
            int giadien = 1000 ; 
            double tiendien = sodien*giadien ;
            System.out.println("Tổng tiền điện của tháng  : "+tiendien);
    }   else if (sodien > 50){
            int giadien = 1200 ;
            double tiendien = 50*1000+(sodien-50)*1200;
            System.out.println("Tổng tiền điện của tháng  : "+tiendien);
    }
            break;
}
            case 4 :{
            return ;
        }
    }
    
}while ( n  <= 10);


        

    }
    
}
