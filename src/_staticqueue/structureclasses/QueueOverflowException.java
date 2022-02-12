package _staticqueue.structureclasses;

public class QueueOverflowException extends RuntimeException {
    public QueueOverflowException() {
        super("cannot enqueue an element into a full queue");
    }
}
