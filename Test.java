package dongcode.bai3;

import java.util.Scanner;

class test {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        Company cp = new Company("BKAV");

        //in ds nv:
        int n=0;
        System.out.print("\nDanh Sach nhan vien la: ");

        if( cp.ds[0] == null ) {
            System.out.print("\nCong ty chua co nhan vien nao!\nBan hay nhap: ");
            System.out.print("\n\tBan muon nhap bao nhieu nhan vien: ");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                cp.ds[i] = new Employee(i+1, "Nam "+(i+1), 1998, 1, "chuyen vien", 0.2+i, 1000);
               // a.ds[i+1] = new Employee(j, "Linh", 1999, 0);
            }

            for (int i = 0; i < n; i++) {
                cp.ds[i].display();
                System.out.print("\n--------------------------\n");
            }

        }
        else {
            for (int i = 0; i < n; i++) {
                cp.ds[i].display();
                System.out.print("\n--------------------------\n");
            }
        }

        //in ra cu the:
        System.out.print("\n---------------------------\n");

        System.out.print("\nNhap id nhan vien: "); n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(cp.ds[i].id == n){
                cp.ds[i].display();
            }
        }


    }
}