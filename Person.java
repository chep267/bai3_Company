package dongcode.bai3;


abstract class Person {

    int id; // ma nhan vien
    String name; // ho ten
    int yearOfBirth; //nam sinh
    int gender; // gioi tinh


    abstract int getId();

    abstract String getName();

    abstract void setName(String s);

    abstract int getyearOfBirth();

    abstract void setyearOfBirth(int s);

    abstract int getGender();

    abstract void setGender(int s);

    abstract void display();
}




