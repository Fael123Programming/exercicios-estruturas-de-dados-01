package java_language.enumeration_2._enum;

public enum BloodType {
    //Enums are made of static constants or objects that can have their own attributes and methods.
    //They are initialized privately inside the enum they're declared in.
    A("It has A antigens on the red blood cells with anti-B antibodies in the plasma", "A"), B("It has B antigens with anti-A" +
            " antibodies in the plasma", "B"), AB("It has both A and B antigens, but no antibodies", "AB"), O("It has no antigens, " +
            "but both anti-A and anti-B antibodies in the plasma", "O");
    private final String info, type;

    BloodType(String info, String type) {
        this.info = info;
        this.type = type;
    }

    public String getInfo(){
        return this.info;
    }

    public String toString(){
        return this.type;
    }
}
