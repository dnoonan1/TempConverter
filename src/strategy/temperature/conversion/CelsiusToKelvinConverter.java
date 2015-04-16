package strategy.temperature.conversion;

/**
 *
 * @author Dan
 */
public class CelsiusToKelvinConverter implements TempConverter {

    private static final double OFFSET = 273.15;
    
    @Override
    public double getConverted(double degrees) {
        return degrees + OFFSET;
    }

}
