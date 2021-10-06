package com.dilqd2008110065.BaiTapVeNha;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do{
        System.out.println("-------------->CHƯƠNG*TRÌNH*NGÂN*HÀNG");
        System.out.println("**    1.Account     **");
        System.out.println("**    2.Cusomter    **");
        System.out.println("**    3.Emloyee     **");
        System.out.println("**    4.Thoát       **");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.print("Nhập lựa chọn : ");
        luaChon = sc.nextInt();
        switch (luaChon) {
            case 1:{
                Account account = new Account(1016960878,0);
                int luaChon1;
                do{
            System.out.println("-------------->CHƯƠNG*TRÌNH*NGÂN*HÀNG");
            System.out.println("**    1.Rút tiền                    **");
            System.out.println("**    2.Gửi tiền                    **");
            System.out.println("**    3.Kiểm tra số dư              **");
            System.out.println("**    4.Quay lại                       **");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.print("Nhập lựa chọn : ");
            luaChon1 = sc.nextInt();
            switch (luaChon1) {
                case 1:{
                    System.out.print("Nhập số tiền muốn rút :");
                    int TienRut = sc.nextInt();
                    account.Withdraw(TienRut);
                    account.Show_Balance();
                    break;
                }
                case 2 :{
                    System.out.print("Nhập số tiền muốn gửi :");
                    int TienGui = sc.nextInt();
                    account.deposite(TienGui);
                    account.Show_Balance();
                    break;
                }
                case 3 :{
                    account.Show_Balance();
                    break;
                }
                case 4 : {
                    break;
                }
               
            }
                }
                while(luaChon1 <=3 && luaChon1 > 0);
                break;
            }
            case 2 :{
                System.out.print("Nhập số lượng khách hàng :");
                int SoLuongKhachHang = sc.nextInt();
                Customer account1 = new Customer(SoLuongKhachHang);
                int luaChon2;
                do{ 
                System.out.println("-------------->CHƯƠNG*TRÌNH*NGÂN*HÀNG");
                System.out.println("**    1.Nhập tên khách hàng                   **");
                System.out.println("**    2.Nhập địa chỉ khách hàng               **");
                System.out.println("**    3.In thông tin khách hàng               **");
                System.out.println("**    4.Quay lại                                 **");
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.print("Nhập lựa chọn : ");
                luaChon2 = sc.nextInt();
                switch (luaChon2) {
                    case 1:{
                        account1.getName();
                        break;
                        }
                    case 2 :{
                        account1.getAddress();
                        break;
                        }
                    case 3 :{
                        account1.Information();
                        break;
                        }
                    case 4 : {
                       break;
                    }
                    }
                }while(luaChon2 <=3 && luaChon2 > 0);
                break;
            }
            case 3 :{
                System.out.print("Nhập số lượng nhân viên :");
                int SoLuongNhanVien = sc.nextInt();
                Emloyee account2 = new Emloyee(SoLuongNhanVien);
                int luaChon3;
                do{ 
                System.out.println("-------------->CHƯƠNG*TRÌNH*NGÂN*HÀNG");
                System.out.println("**    1.Nhập tên nhân viên                    **");
                System.out.println("**    2.Nhập lương nhân viên                  **");
                System.out.println("**    3.In thông tin nhân viên                **");
                System.out.println("**    4.Quay lại                                **");
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.print("Nhập lựa chọn : ");
                luaChon3 = sc.nextInt();
                switch (luaChon3) {
                    case 1:{
                        account2.getName();
                        break;
                        }
                    case 2 :{
                        account2.getSalary();
                        break;
                        }
                    case 3 :{
                        account2.printInfomationEmployee();
                        break;
                        }
                    case 4 : {
                        break;
                    }
                    }
                }while(luaChon3 <=3 && luaChon3 > 0);
            }
            default:
                break;
        }
    }while (luaChon <=3 && luaChon >0);
}
}