package java_language.anonymous_class.anon;

public abstract class Xerk {
    private int number;
    private String string;

    public Xerk(){}

    public Xerk(int number, String string) {
        this.number = number;
        this.string = string;
    }

    public abstract void doSomething();

    public abstract String doSomethingAndReturnAString(int parameter);

    public int getNumber() {
        return number;
    }

    public String getString() {
        return string;
    }
}
