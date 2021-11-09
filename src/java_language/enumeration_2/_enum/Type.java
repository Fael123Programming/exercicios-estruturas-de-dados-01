package java_language.enumeration_2._enum;

public enum Type {
//    If you want, you can rewrite methods declared in the general body of an enum by using the "constant specific
//    class body": open curly braces on the right side of the constant you want to get its methods changed and rewrite
//    them as desired.
//    Then, the same methods will have different behaviour depending on the constant used to call them!
    TYPE1(1, "German"){
        public String getId(){
            return "getId() from TYPE1";
        }
    }, TYPE2(2, "American"){
        public String getId(){
            return "getId() from TYPE2";
        }
    }, TYPE3(3, "French");
    private final int number;
    private final String typeStr;

    Type(int number, String typeStr) {
        this.number = number;
        this.typeStr = typeStr;
    }

    public int getNumber(){ return this.number; }

    public String getTypeStr(){ return this.typeStr; }

    public String getId(){ return "getId() from TYPE3"; }

}
