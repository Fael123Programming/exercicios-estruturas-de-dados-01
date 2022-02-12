package _dynamicqueue.structureclasses;

public class EmptyQueueException extends RuntimeException {
    public EmptyQueueException() {
        super("cannot dequeue an empty queue");
    }
}
