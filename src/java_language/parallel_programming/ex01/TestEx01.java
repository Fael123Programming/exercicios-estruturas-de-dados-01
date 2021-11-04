package java_language.parallel_programming.ex01;

public class TestEx01 {
//    A program is nothing but a process being run on your machine.
//    This process can be split into sub-entities that have their own way of execution.
//    These sub-entities are sub-routines that allow us to run things at the same time.
//    That is, when your machine is doing a task, another one can be performed meanwhile.
//    Then, we can name them as threads (execution lines) of our process.
//    To use threads in practical contexts we have the class Thread which receives as argument of
//    its constructor an object that implements the interface Runnable (with the method run()).
//    Then, a thread will execute or trigger that very object based on its implementation of
//    the method run(), gotten from the interface Runnable.
//    You can also extend from the class Thread (which by itself implements Runnable) and implement the
//    method run() there, but this practice is not advisable because you're inheriting lots of others methods
//    as well.
    public static void main(String[] args) {
        Thread chargeBar = new Thread(new ChargeBar(100, 50));
        chargeBar.start();
        try {
            Thread.sleep(8000);
        } catch(InterruptedException exc) {}
        System.out.println();
        DoSomethingElse doer = new DoSomethingElse();
        doer.start(); //As it is a thread by definition, it has the method start() which evokes run().
    }

    private static class ChargeBar implements Runnable {
        private int dashes;
        private long delay;

        public ChargeBar(int dashes, long delay) {
            this.dashes = dashes;
            this.delay = delay;
        }

        public void setDashes(int newQuantity) {
            this.dashes = newQuantity;
        }

        public void setDelay(long newDelay) {
            this.delay = newDelay;
        }

        @Override
        public void run() {
            int local = this.dashes;
            while (local > 0) {
                System.out.print("-");
                try {
                    Thread.sleep(this.delay);
                } catch (InterruptedException exc) {
                    System.out.println("Thread was interrupted");
                    System.exit(-1);
                }
                local--;
            }
        }
    }

    private static class DoSomethingElse extends Thread { //Bad pattern! Inheriting too many methods also...
        //Its attributes and methods come here...
        @Override
        public void run(){
            //Do something else...
            System.out.println("DoSomethingElse instance is doing something else...");
        }
    }
}
