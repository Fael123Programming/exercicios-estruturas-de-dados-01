package _testing_java_lang.class_object;

//Testing and overriding .toString() and .equals(), methods from class Object

public class TestClassObject /*extends Object*/{
    private String string;

    public TestClassObject(String string){
        this.string = string;
    }

    public String getString(){return this.string;}

    @Override //from class Object inherited automatically
    public String toString(){ //If not overridden, it would provide the memory address of the object
        return "string: " + this.string;
    }

    @Override //from class Object inherited automatically
    public boolean equals(Object toCompare){
        if (!(toCompare instanceof TestClassObject)) return false; //If toCompare is null the line above will catch it also!
        return ((TestClassObject) toCompare).getString().equals(this.string);
    }
}
