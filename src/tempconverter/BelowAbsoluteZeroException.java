package tempconverter;

/**
 *
 * @author Dan
 */
public class BelowAbsoluteZeroException extends Exception {

    /**
     * Creates a new instance of <code>BelowAbsoluteZeroException</code> without
     * detail message.
     */
    public BelowAbsoluteZeroException() {
    }

    /**
     * Constructs an instance of <code>BelowAbsoluteZeroException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public BelowAbsoluteZeroException(String msg) {
        super(msg);
    }
}
