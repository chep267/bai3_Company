package dongcode.bai3;

enum Married {
    Y("Da ket hon"),
    N("Doc than");


    private  String name;
    private Married(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name ;
    }
}