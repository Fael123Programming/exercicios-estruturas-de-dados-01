package java_language.parallel_programming.ex02;

public class TestEx02 {
    public static void main(String[] args) {
        Program p1 = new Program(1);
        Runnable p2 = new Program(2); //Using polymorphism: different ways of referring to the same object.
        Program p3 = new Program(3);
        Thread tp1 = new Thread(p1), tp2 = new Thread(p2), tp3 = new Thread(p3);
        tp1.start();
        tp2.start();
        tp3.start();
//        The output looks like a mess but is not: the program responsible for organizing who has to be executed now
//        is called the 'thread scheduler': it tells the computer processor to focus on a thread for a specific
//        amount of time and after that, to change to another one and start executing it (context change).
//        Each thread state is saved when it is left apart for a while.
//        After the scheduler have returned to it once again, all information about it is restored again.
//        As it is parallel execution, it should not matter which thread executes first, that is why it looks like
//        a pretty mess.
    }
    public static class Program implements Runnable { //Inner class.
        private final int id;

        public Program(int id) { this.id = id; }

        @Override
        public void run(){
            for (int i = 0; i < 10000; i++) {
                System.out.println("Program " + id + " " + i);
            }
        }
    }
}
