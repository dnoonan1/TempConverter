package tempconverter;

import strategy.temperaturescale.TemperatureScale;

/**
 *
 * @author Dan
 */
public class TempConversionService2 {
    
    private TemperatureScale original;
    private TemperatureScale target;
    
    public void setOriginalAndTarget(TemperatureScale original,
            TemperatureScale target) {
        this.original = original;
        this.target = target;
    }
    
    public double getConverted(double degrees)
            throws TemperatureOutOfRangeException {
        if (degrees < original.absoluteZero()
                || degrees > original.absoluteHot()) {
            throw new TemperatureOutOfRangeException();
        }
        return target.fromKelvins(original.toKelvins(degrees));
    }
    
}
