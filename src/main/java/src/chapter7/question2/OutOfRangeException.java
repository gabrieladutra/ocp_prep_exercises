package src.chapter7.question2;

public class OutOfRangeException extends IllegalArgumentException {
    public final int min;
    public final int max;
    public final int value;

    public OutOfRangeException(final int min, final int max, final int value) {
        super(value + " is out of range from " + min + " to " + max);
        this.min = min;
        this.max = max;
        this.value = value;
    }
}
