package java_language.anonymous_class.anon;

public class TestXerk {
    public static void main(String[] args) {
        Xerk xerk = new Xerk(123, "Bla bla"){
          @Override
          public void doSomething(){
              System.out.println("Doing something...");
          }

          @Override
            public String doSomethingAndReturnAString(int value){
              return value + " was passed...";
          }
        }; //Anonymous class!
        xerk.doSomething();
        System.out.println(xerk.doSomethingAndReturnAString(100));
        System.out.println(xerk.getNumber());
        System.out.println(xerk.getString());
    }
}
