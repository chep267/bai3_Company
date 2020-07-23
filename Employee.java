package dongcode.bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


class Employee extends Person {

    Date dateJoin; //ngay bat dau lam viec
    //String date;
    String position; //vi tri nhan vien
    double salaryLevel; //Bac luong
    double basicSalary; //Luong co ban

    Employee() {}

    Employee(int ms, String ten, int ns, int gd, String vt, double sr, double basicsr) {
        id = ms;
        name = ten;
        yearOfBirth = ns;
        gender = gd;
        position = vt;
        basicSalary = basicsr;
        salaryLevel = sr;
    }

    //tra ve id:
    public int getId() {
        return id;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    void setName(String s) {
        name = s;
    }

    @Override
    int getyearOfBirth() {
        return yearOfBirth;
    }

    @Override
    void setyearOfBirth(int s) {
        yearOfBirth = s;
    }

    @Override
    int getGender() {
        return gender;
    }

    @Override
    void setGender(int s) {
        gender = s;
    }

    //tra ve thu nhap:
    public double getIncome() {
        return salaryLevel * basicSalary;
    }

    // Cap nhat luong:
    public void setSalaryLevel( double s) {
        salaryLevel = s;
    }

    //thiet lap luong co ban:
    public void setBasicSalary( double s) {
        basicSalary = s;
    }

    //nhap:
    public void nhap()  {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\tDinh danh: "); id = sc.nextInt();
        System.out.print("\n\tTen: "); name = sc.nextLine();
        System.out.print("\n\tNam sinh : "); yearOfBirth = sc.nextInt();
        System.out.print("\n\tGioi tinh : "); gender = sc.nextInt();
        System.out.print("\n\tTinh trang hon nhan ");
        System.out.print("\n\tNgay bat dau lam viec: ");
        String d; d = sc.nextLine();
        SimpleDateFormat dateJoin = new SimpleDateFormat("dd/MM/yyyy");
        dateJoin.setLenient(false); // set false để kiểm tra tính hợp lệ của date. VD: tháng 2 phải có 28-29 ngày, năm có 12 tháng,....
        try {
            dateJoin.parse(d); // parse dateString thành kiểu Date
        }
        catch (ParseException e) { // quăng lỗi nếu dateString ko hợp lệ
            System.out.println("Invalid date");
        }
        System.out.print("\n\tVi tri: "+ position);
        System.out.print("\n\tThu nhap: "+ getIncome());
    }

    //in:
    public void display() {
        System.out.print("\n\tMa nhan vien: "+ id);
        System.out.print("\n\tTen: "+name);
        System.out.print("\n\tNam sinh : "+yearOfBirth);

        if( gender==0 ) {
            System.out.print("\n\tGioi tinh : Nu");
        }else if( gender==1 ) {
            System.out.print("\n\tGioi tinh : Nam");
        }

        System.out.print("\n\tTinh trang hon nhan: chua ket hon.");
        System.out.print("\n\tNgay bat dau lam viec: 2020");
        System.out.print("\n\tVi tri: "+ position);
        System.out.print("\n\tThu nhap: "+ getIncome());
    }
}