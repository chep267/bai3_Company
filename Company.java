package dongcode.bai3;

import java.util.ArrayList;
import java.util.Date;

class Company {

    String name; //ten cty
    Date dateCreate; //ngay sang lap cty
    ArrayList<Employee> ds = new ArrayList<Employee>(10);


    Company( String ten) {
        name = ten;
    }

    // lay ten cong ty:
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
        if ( ds.size() < 10 ) {
            ds.add(e);
            System.out.print("\nThem nhan vien thanh cong!");
        }
        else {
            info();
            System.out.print("\nKhong the them nhan vien moi.");
        }

    }

    public void info() {
        if ( ds.size() == 10 ) {
            System.out.print("\nThong bao: Cong ty da tuyen du nhan vien!");
        }
    }
}