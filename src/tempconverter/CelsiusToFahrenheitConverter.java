package tempconverter;

/**
 *
 * @author Dan
 */
public class CelsiusToFahrenheitConverter implements TempConverter {

    private static final double SCALE = 9 / 5.0;
    private static final double FREEZING_POINT = 32;
    
    @Override
    public double getConverted(double degrees) {
        return SCALE * degrees + FREEZING_POINT;
    }
    
}
