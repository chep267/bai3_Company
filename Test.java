package bai5;

import java.text.ParseException;
import java.util.Scanner;

public class test {
    public static void main(String[] arg) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Company a = new Company();
        //in ds nv:
        System.out.print("\nDanh Sach nhan vien la: ");
        if(a.employees[0] == null){
            System.out.print("\nCong ty chua co nhan vien nao!\nBan hay nhap: ");
            System.out.print("\n\tBan muon nhap bao nhieu nhan vien: ");
            for (int i = 0; i < 10; i++) {
                a.employees[i].nhap();
            }
        }

        //in ra cu the:
        int id;
        System.out.print("\nNhap id nhan vien: "); id = sc.nextInt();
        for (int i = 0; i <10; i++) {
            if(a.employees[i].id == id){
                a.employees[i].display();
            }
        }
    }
}
