package dongcode.bai3;

import java.text.ParseException;
import java.util.Date;

class Company extends Employee {

    String name; //ten cty
    Date dateCreate; //ngay sang lap cty
    Employee[] ds = new Employee[10];

    Company( String ten) {
        name = ten;
    }
    // ten cong ty:
    public String get_name() {
        return name;
    }

    //in ds nhan vien:
    public  void showListEmployees() {
        for( Employee e : ds) {
            e.display();
            System.out.print("\n--------------------------\n");
        }
    }

    //them 1 nv moi:
    public void addNewEmployee(Employee e)  {
        int dem=0;
        for( int i=0; i<10; i++) {
            if( ds[i]==null ){
                ds[i] = e;
                dem++;
                break;
            }
        }
        if( dem==0 ) {
            info();
        }
        else {
            System.out.print("\nThem nhan vien thanh cong!");
        }
    }

    public void info() {
        System.out.print("\nCong ty da tuyen du nhan vien!");
    }
}