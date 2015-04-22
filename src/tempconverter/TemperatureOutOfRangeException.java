package tempconverter;

/**
 *
 * @author Dan
 */
public class TemperatureOutOfRangeException extends Exception {

    /**
     * Creates a new instance of <code>BelowAbsoluteZeroException</code> without
     * detail message.
     */
    public TemperatureOutOfRangeException() {
    }

    /**
     * Constructs an instance of <code>BelowAbsoluteZeroException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public TemperatureOutOfRangeException(String msg) {
        super(msg);
    }
}
