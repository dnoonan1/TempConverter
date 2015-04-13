package tempconverter;

/**
 *
 * @author Dan
 */
public class FahrenheitToCelsiusConverter implements TempConverter {

    private static final double SCALE = 5 / 9.0;
    private static final double FREEZING_POINT = 32;
    
    @Override
    public double getConverted(double degrees) {
        return SCALE * (degrees - FREEZING_POINT);
    }
    
}
