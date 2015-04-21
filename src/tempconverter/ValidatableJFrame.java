package tempconverter;

import javax.swing.JFrame;
import util.validation.ValidatableWithValidator;

/**
 *
 * @author Dan
 */
public abstract class ValidatableJFrame extends JFrame {
    
    private ValidatableWithValidator[] fields;
    
    public void setFields(ValidatableWithValidator[] fields) {
        this.fields = fields;
    }
    
    public void validateAll() {
        for (ValidatableWithValidator field : fields) {
            if (!field.isValidated()) {
                showErrorMessage(field.getErrorMessage());
            }
        }
    }
    
    public abstract void showErrorMessage(String message);
    
}
