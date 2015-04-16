package strategy.temperature.conversion;

/**
 *
 * @author Dan
 */
public class FahrenheitToKelvinConverter implements TempConverter {
    
    private static final TempConverter F2C = new FahrenheitToCelsiusConverter();
    private static final TempConverter C2K = new CelsiusToKelvinConverter();

    @Override
    public double getConverted(double degrees) {
        return C2K.getConverted(F2C.getConverted(degrees));
    }
    
}
