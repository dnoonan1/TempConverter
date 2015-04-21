package util.validation;

/**
 *
 * @author Dan
 * @param <T>
 */
public interface ValidatableWithValidator<T> extends Validatable {
    Validator<T> getValidator();
    void setValidator(Validator<T> validator);
    String getErrorMessage();
    void setErrorMessage(String message);
}
