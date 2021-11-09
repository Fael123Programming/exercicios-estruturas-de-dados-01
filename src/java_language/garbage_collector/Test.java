package java_language.garbage_collector;

public class Test {
//    Garbage Collector is a thread responsible for freeing all memory spaces used by an object
//    that is not any more being referred to by any reference variable.
//    As it is a thread, you do not know when exactly it is going to be executed, but it will
//    some time. Keep in mind that this thread frees only objects and never variables of primitive
//    types.
    public static void main(String[] args) {
        String string;
        for (int i = 0; i < 10000; i++) {
            string = i + " is record now";
            string = null;
            System.gc();
//            Says to JVM to possibly execute Garbage Collector.
//            Equivalent to Runtime.getRuntime().gc().
        }
    }
}
