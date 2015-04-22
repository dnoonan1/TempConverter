package strategy.tempconverter;

/**
 *
 * @author Dan
 */
public class KelvinToCelsiusConverter implements TempConverter {

    private static final double OFFSET = 273.15;
    
    @Override
    public double getConverted(double degrees) {
        return degrees - OFFSET;
    }
    
}
