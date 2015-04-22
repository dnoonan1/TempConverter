package tempconverter;

import javax.swing.JTextField;
import util.validation.Validatable;
import util.validation.Validator;

/**
 *
 * @author Dan
 */
public class ValidatableJTextField
    extends JTextField implements Validatable<String> {
    
    private Validator<String> validator;
    private String errorMessage;
    
    @Override
    public Validator<String> getValidator() {
        return validator;
    }

    @Override
    public void setValidator(Validator<String> validator) {
        if (validator == null) {
            throw new IllegalArgumentException();
        }
        this.validator = validator;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public void setErrorMessage(String message) {
        this.errorMessage = message;
    }
    
    @Override
    public boolean isValidated() {
        return validator.isValid(this.getText());
    }
    
}
