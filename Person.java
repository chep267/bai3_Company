package bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    int id = 0;
    String name;
    int yearOfBirth=0;
    int gender=0;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    public int getyearOfBirth(){
        return yearOfBirth;
    }
    public void setyearOfBirth(int s){
        yearOfBirth = s;
    }
    public int getgender(){
        return gender;
    }
    public void setgender(int s){
        gender = s;
    }
    public void nhap() throws ParseException {}
    public void display(){
        System.out.print("\n\tDinh danh: "+id);
        System.out.print("\n\tTen: "+name);
        System.out.print("\n\tNam sinh : "+yearOfBirth);
        if(gender==0){
            System.out.print("\n\tGioi tinh : Nu");
        }else if(gender==1){
            System.out.print("\n\tGioi tinh : Nam");
        }
        System.out.print("\n\tTinh trang hon nhan ");
    }
}


class Employee extends Person{
    int id = 0;
    String name;
    int yearOfBirth=0;
    int gender=0;
    Date dateJoin; //ngay bat dau lam viec
    String date;
    String position; //vi tri nhan vien
    double salaryLevel; //Bac luong
    double basicSalary; //Luong co ban

    public int getId(){
        return id;
    }
    public double getIncome(){
        return salaryLevel * basicSalary;
    }
    public void setSalaryLevel( double s){
        salaryLevel = s;
    }
    public void setBasicSalary( double s){
        basicSalary = s;
    }
    //nhap:
    public void nhap() throws ParseException {
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
    public void display(){
        System.out.print("\n\tDinh  danh: "+ id);
        System.out.print("\n\tTen: "+name);
        System.out.print("\n\tNam sinh : "+yearOfBirth);
        if(gender==0){
            System.out.print("\n\tGioi tinh : Nu");
        }else if(gender==1){
            System.out.print("\n\tGioi tinh : Nam");
        }
        System.out.print("\n\tTinh trang hon nhan ");
        System.out.print("\n\tNgay bat dau lam viec: "+ dateJoin);
        System.out.print("\n\tVi tri: "+ position);
        System.out.print("\n\tThu nhap: "+ getIncome());
    }
}

class Company extends Employee{
    String name; //ten cty
    Date dateCreate; //ngay sang lap cty
    Employee[] employees = new Employee[10];

    public String get_name(){
        return name;
    }
    //in ds nhan vien:
    public  void showListEmployees(){
        display();
    }
    //them 1 nv moi:
    public void addNewEmployee(Employee e) throws ParseException {
        e.nhap();
    }
    public void info(){
        System.out.print("\nCong ty da tuyen du nhan vien!");
    }
}
