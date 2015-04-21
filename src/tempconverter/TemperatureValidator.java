package tempconverter;

import strategy.temperature.conversion.TempScale;
import util.validation.Validator;

/**
 *
 * @author Dan
 */
public class TemperatureValidator implements Validator<Double> {

    private TempScale scale;

    public TemperatureValidator(TempScale scale) {
        setScale(scale);
    }
    
    public void setScale(TempScale scale) {
        this.scale = scale;
    }
    
    @Override
    public boolean isValid(Double temp) {
        return temp >= scale.getAbsoluteZero();
    }
    
}
