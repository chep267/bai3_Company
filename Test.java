package dongcode.bai3;

import java.util.Scanner;

class test {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        Company cp = new Company("BKAV");

        //in ds nv:
        int n=0;
        cp.ds.add( new Employee(n+1, "Nam", 1998,  Gender.M , Married.Y, "chuyen vien", 0.25, 1000) ); n++;
        cp.ds.add( new Employee(n+1, "Linh", 2000,  Gender.F , Married.N, "Nhan Vien", 0.15, 900) ); n++;

        System.out.print("\n---------------------------\n");
        System.out.println("Danh Sach nhan vien la: ");
        for (int i = 0; i < n; i++) {
            cp.ds.get(i).display();
            System.out.print("\n--------------------------\n");
        }


        //in ra cu the:
        do {
            System.out.println("Nhap id nhan vien: "); n = sc.nextInt();
            if( n > cp.ds.size() ) System.out.println("Khong co, hay nhap lai.");
        } while ( n > cp.ds.size() );

        for (int i = 0; i < n; i++) {
            if ( cp.ds.get(i).id == n ) {
                cp.ds.get(i).display();
            }
        }

    }
}