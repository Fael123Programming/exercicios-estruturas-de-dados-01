package java_language.final_modifier;

public class Test {
    public static void main(String[] args) {
        Super superObj = new Super();
        superObj.aMessage();
        (new Child()).aMessage("A new message");
    }
}
