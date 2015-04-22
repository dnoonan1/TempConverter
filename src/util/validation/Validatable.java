package util.validation;

/**
 *
 * @author Dan
 * @param <T>
 */
public interface Validatable<T> {
    Validator<T> getValidator();
    void setValidator(Validator<T> validator);
    String getErrorMessage();
    void setErrorMessage(String message);
    boolean isValidated();
}
