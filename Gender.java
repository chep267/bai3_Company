package dongcode.bai3;

public enum Gender {
    M("Male"),
    F("Female"),
    O("Other");

    private final String name;
    private Gender(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name ;
    }
}