package util.validation;

/**
 *
 * @author Dan
 * @param <T>
 */
public interface Validator<T> {
    boolean isValid(T t);
}
