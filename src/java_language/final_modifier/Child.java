package java_language.final_modifier;

public class Child extends Super {
    /* public void aMessage(){

    } */
//    Final methods are not liable of being overridden, but they can be overloaded.
    public void aMessage(String text) {
        super.aMessage();
        System.out.println(text);
    }
}
