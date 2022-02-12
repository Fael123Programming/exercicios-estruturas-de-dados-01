package _staticqueue.structureclasses;

public class QueueUnderflowException extends RuntimeException {
    public QueueUnderflowException() {
        super("cannot dequeue an element from an empty queue");
    }
}
