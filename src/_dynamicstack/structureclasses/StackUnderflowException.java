package _dynamicstack.structureclasses;

public class StackUnderflowException extends RuntimeException {
    public StackUnderflowException() {
        super("cannot pop an empty stack");
    }
}
