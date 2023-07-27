package module6.exceptions_and_io.timeexception;

/**
 * Indicates an error in parsing time
 */
public class TimeFormatException extends RuntimeException {
    private static final long serialVersionUID = -2928895735526016619L;

    public TimeFormatException(String message) {
        super(message);
    }
}