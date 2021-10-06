package com.dilqd2008110065.BaiTapVeNha;
public class Account {
    int account_number ;
    int account_balance ;
    Account(int a , int b){
        account_number = a;
        account_balance = b;
    }
    public void Show_Balance() {

        System.out.println("Số tài khoản : " + account_number);

        System.out.println("Số Dư :" + account_balance);
    }
    public void deposite(int amout){
        if(amout > 0){
            account_balance += amout;
        }
        else System.out.println("Lỗi Thao Tác Vui Lòng Kiểm Tra Lại !!!");
    }
    public void Withdraw(int ammout){
        if(ammout < account_balance && ammout > 0){
            account_balance -= ammout;
        }
        else System.out.println("Lỗi Thao Tác Vui Lòng Kiểm Tra Lại !!!");
    }
}
