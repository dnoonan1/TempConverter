package tempconverter;

import java.util.List;
import javax.swing.JFrame;
import util.validation.Validatable;

/**
 *
 * @author Dan
 */
public abstract class ValidatableJFrame extends JFrame {
    
    private List<Validatable> validatables;
    
    public void setValidatables(List<Validatable> validatables) {
        this.validatables = validatables;
    }
    
    public void validateAll() {
        for (Validatable v : validatables) {
            if (!v.isValidated()) {
                showErrorMessage(v.getErrorMessage());
            }
        }
    }
    
    public abstract void showErrorMessage(String message);
    
}
