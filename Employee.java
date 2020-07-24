package dongcode.bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


class Employee extends Person {

    int id; // ma nhan vien
    Date joinDate; //ngay bat dau lam viec
    //String date;
    String position; //vi tri nhan vien
    double salaryLevel; //Bac luong
    double basicSalary; //Luong co ban



    Employee() {}

    Employee(int ms, String ten, int ns, Gender gd, Married mr, String pos, double srLever, double basicsr) {
        id = ms;
        name = ten;
        yearOfBirth = ns;
        gender = gd;
        married = mr;
        position = pos;
        basicSalary = basicsr;
        salaryLevel = srLever;
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
    String getGender() {
        return gender.getName();
    }

    @Override
    void setGender(Gender gd) {
        gender = gd;
    }

    @Override
    String getMarried() {
        return married.getName();
    }

    @Override
    void setMarried(Married mr) {
        married = mr;
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
        System.out.println("\tDinh danh: "); id = sc.nextInt();
        System.out.println("\tTen: "); name = sc.nextLine();
        System.out.println("\tNam sinh : "); yearOfBirth = sc.nextInt();
        System.out.println("\tGioi tinh : "); int n = sc.nextInt();
        System.out.println("\tTinh trang hon nhan "); married = Married.N;
        System.out.println("\tNgay bat dau lam viec: ");
        String d; d = sc.nextLine();
        SimpleDateFormat joinDate = new SimpleDateFormat("dd/MM/yyyy");
        joinDate.setLenient(false); // set false để kiểm tra tính hợp lệ của date. VD: tháng 2 phải có 28-29 ngày, năm có 12 tháng,....
        try {
            joinDate.parse(d); // parse dateString thành kiểu Date
        }
        catch (ParseException e) { // quăng lỗi nếu dateString ko hợp lệ
            System.out.println("Invalid date");
        }
        System.out.println("\tVi tri: " + position);
        System.out.println("\tThu nhap: " + getIncome());
    }

    //in:
    public void display() {
        System.out.println("\tMa nhan vien: "+ id);
        System.out.println("\tTen: " + getName());
        System.out.println("\tNam sinh : " + getyearOfBirth());
        System.out.println("\tGioi tinh : " + getGender());
        System.out.println("\tTinh trang hon nhan: " + getMarried());
        System.out.println("\tNgay bat dau lam viec: 2020");
        System.out.println("\tVi tri: "+ position);
        System.out.println("\tThu nhap: " + getIncome() + " $");
    }
}