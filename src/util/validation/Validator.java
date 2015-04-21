package util.validation;

/**
 *
 * @author Dan
 */
public interface Validator<T> {
    boolean isValid(T t);
}
