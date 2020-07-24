package dongcode.bai3;


abstract class Person {

    String name; // ho ten
    int yearOfBirth; //nam sinh
    // gioi tinh
    Gender gender;
    Married married;

    //Lay id
    abstract int getId();

    //Lay ten
    abstract String getName();

    //Sua ten
    abstract void setName(String s);

    //Lay nam sinh
    abstract int getyearOfBirth();

    //Sua nam sinh
    abstract void setyearOfBirth(int s);

    //Lay gioi tinh
    abstract String getGender();

    //sua gioi tinh
    abstract void setGender(Gender gd);

    //Lay tinh trang hon nhan
    abstract String getMarried();

    //sua gioi tinh
    abstract void setMarried(Married mr);

    //In thong tin
    abstract void display();
}




